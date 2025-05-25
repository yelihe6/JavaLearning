package org.example.chapter10_OOP2.InnerClass.anonymous;
import chapter10_OOP2.InnerClass.anonymous.Stu.Jiajia;
import chapter10_OOP2.InnerClass.anonymous.Stu.Minghui;
import chapter10_OOP2.InnerClass.anonymous.Stu.Student;

public class Test {     //匿名内部类的多态表现

    public static void main(String[] args) {
        //        Student s = new Student() {
//            @Override
//            public void sub() {
//                System.out.println("武美梦");
//            }
//        };
//        s.sub();
        method(

                new Jiajia() {
                    @Override
                    public void sub() {
                        System.out.println("张嘉佳");
                    }
                }
        );
        method(

                new Minghui() {
                    @Override
                    public void sub() {
                        System.out.println("张铭慧");
                    }
                }
        );
    }

    public static void method(Student s){
        s.sub();
    }


}
