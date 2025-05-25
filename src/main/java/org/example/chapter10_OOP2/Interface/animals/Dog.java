package org.example.chapter10_OOP2.Interface.animals;

public class Dog extends Animals implements Actions{
    @Override
    public void eat(String something) {
        System.out.println("狗吃:"+something);
    }

    public Dog() {
    }

    public Dog(String name, String age) {
        super(name, age);
    }

    @Override
    public void Swiming() {
        System.out.println("狗刨");
    }
}
