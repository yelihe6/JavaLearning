package org.example.chapter10_OOP2.Extend.Test0;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Manager manager = new Manager();

        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        stringJoiner.add(manager.getId());
        stringJoiner.add(manager.getName());
        stringJoiner.add(manager.getSalary());
        stringJoiner.add(manager.set("3000元"));
        stringJoiner.add(manager.Work("管理其他人"));
        stringJoiner.add(manager.Eat("吃米饭"));
        System.out.println(stringJoiner);

        StringJoiner stringJoiner2 = new StringJoiner(",","[","]");
        stringJoiner2.add(cooker.getId());
        stringJoiner2.add(cooker.getName());
        stringJoiner2.add(cooker.getSalary());
        stringJoiner2.add(cooker.Work("炒菜"));
        stringJoiner2.add(cooker.Eat("吃米饭"));
        System.out.println(stringJoiner2);


    }
}
