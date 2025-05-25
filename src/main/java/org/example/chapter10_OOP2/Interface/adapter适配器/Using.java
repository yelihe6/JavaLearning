package org.example.chapter10_OOP2.Interface.adapter适配器;

public class Using extends ImplAdapter{

    @Override
    public void method1() {
        super.method1();
    }

    @Override
    public void method2() {
        super.method2();
    }

    public static void main(String[] args) {
        Using using  = new Using();
        using.getAge();
    }
}
