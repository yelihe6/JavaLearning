package org.example.chapter6_method.definition;

public class Definite {

    //static
    public void learning(String name, String age, String birthday){
        System.out.println(name + "\t正在游山玩水");
        System.out.println("年龄: " + age);
        System.out.println("生日: " + birthday);

    }



    public static void main(String[] args) {
//        learning("张铭慧");
        Definite definite = new Definite();
        definite.learning("张铭慧", "18", "2004.12.26");
    }
}
