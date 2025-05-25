package org.example.chapter10_OOP2.polymorphism.Test;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王","30岁");
        Person p2 = new Person("老王","30岁");
        Animal c = new Cat();
        Animal d = new Dog();

        c.setAge("3岁");
        c.setColor("灰颜色");

        d.setAge("2岁");
        d.setColor("黑颜色");

        p1.keepPet(c,"鱼");
        p2.keepPet(d,"骨头");

    }
}
