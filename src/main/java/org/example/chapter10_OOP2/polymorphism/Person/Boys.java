package org.example.chapter10_OOP2.polymorphism.Person;

public class Boys extends Person{

    @Override
    public void show() {
        System.out.println("男孩的信息为: "+getName()+","+getArea());
    }


}
