package org.example.chapter7_OOP.construction;

public class Test {
    public static void main(String[] args) {

        Construct c = new Construct();
        Construct cc = new Construct(18, "女");
        System.out.println(cc);
        System.out.println(cc.getAge());
        System.out.println(cc.getGender());

    }
}
