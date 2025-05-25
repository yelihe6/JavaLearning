package org.example.chapter10_OOP2.Extend.Super;

public class Test extends Father{

//    总结:super关键字来自其类继承的直接父类,如果直接父类没有,则从间接父类中寻找,如此往复
//    this关键字优先来自类当中的成员变量,如果没有,则来到直接父类中寻找
//    没有修饰的变量先是寻找本方法中的局部变量,没有则按this的查找原则

    //就近原则

    String x = "陈盈盈";

    public void Son(){
        String x = "黄意窈";
        Son2();
    }
    public void Son2(){
        String x = "夏冰倩";
        System.out.println(x);//夏冰倩
        System.out.println(this.x);//陈盈盈
        System.out.println(super.x);//郑洁
        System.out.println(super.x.equals(x));
        System.out.println(super.x.equals(this.x));
    }

    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        System.out.println(grandFather.x);
        Test test = new Test();
        test.Son();

    }

}
