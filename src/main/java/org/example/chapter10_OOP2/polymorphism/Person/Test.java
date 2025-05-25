package org.example.chapter10_OOP2.polymorphism.Person;

import chapter10_OOP2.polymorphism.Person.Boys;
import chapter10_OOP2.polymorphism.Person.Girls;
import chapter10_OOP2.polymorphism.Person.Person;

public class Test {
    public static void main(String[] args) {
        Girls girls1 = new Girls();
        Girls girls2 = new Girls();
        Boys boys1 = new Boys();
        Boys boys2 = new Boys();

        girls1.setName("武美梦");
        girls1.setArea("温州");
        Register(girls1);  //多态  Person P = new Girls();
        girls2.setName("郑洁");
        girls2.setArea("上海");
        Register(girls2);

        boys1.setName("戴俊炜");
        boys1.setArea("杭州");
        Register(boys1);
        boys2.setName("陈展翔");
        boys2.setArea("济南");
        Register(boys2);

    }
    public static void Register(Person person){
        person.show();
    }
}
