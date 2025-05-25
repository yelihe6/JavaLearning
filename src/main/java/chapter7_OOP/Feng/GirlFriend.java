package chapter7_OOP.Feng;

public class GirlFriend {

    private int age;

    public void setAge(int age){
        if (age >= 16 && age <= 19){
            this.age = age;     //this关键字    指向成员变量
            //     就近原则,使其不与形参混淆
            System.out.println("喜欢"+this.age+"岁的张铭慧");
        }else {
            System.out.println("数据不合理");
        }
//        return get;
//
    }

//    public int getAge(){
//        return age;
//    }

}
