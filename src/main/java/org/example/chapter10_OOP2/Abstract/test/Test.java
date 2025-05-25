package org.example.chapter10_OOP2.Abstract.test;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙","5岁");
        Dog dog = new Dog("狗","4岁");
        Sheep sheep = new Sheep("羊","3岁");

        System.out.println(frog.getType()+","+frog.getAge());
        frog.Action();
    }
}
