package org.example.chapter10_OOP2.Interface.sportclub;

import chapter10_OOP2.Interface.sportclub.PingPong.PingA;

import java.util.StringJoiner;

public class Test {


    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        PingA pingA = new PingA("小康","16岁");
        String position = pingA.Type("运动员");
        String action = pingA.action("学");
        String name = pingA.getName();
        String age = pingA.getAge();
        stringJoiner.add(position+":"+name);
        stringJoiner.add(age);
        stringJoiner.add(action);
        System.out.println(stringJoiner);
        pingA.speak();






    }
}
