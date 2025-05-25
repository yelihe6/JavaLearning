package org.example.chapter10_OOP2.InnerClass.test;

public class test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
