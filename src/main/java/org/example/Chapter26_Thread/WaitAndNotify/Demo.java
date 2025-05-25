package org.example.Chapter26_Thread.WaitAndNotify;

public class Demo {


    public static void main(String[] args) {

        Foddie foddie = new Foddie();
        Cook cook = new Cook();

        Thread t1 = new Thread(foddie,"foddie");
        Thread t2 = new Thread(cook,"cook");

        t1.start();
        t2.start();

    }
}
