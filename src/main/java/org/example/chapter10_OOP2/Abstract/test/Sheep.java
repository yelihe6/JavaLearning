package org.example.chapter10_OOP2.Abstract.test;

public class Sheep extends Animals{
    @Override
    public void Action() {
        System.out.println("吃草,喝水");
    }

    public Sheep() {
    }

    public Sheep(String type, String age) {
        super(type, age);
    }
}
