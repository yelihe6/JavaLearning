package org.example.Chapter26_Thread.Test.DeliverPresent;

public class Test {

    public static void main(String[] args) {

        Present present = new Present();

        Thread t1 = new Thread(present,"沈婧怡");
        Thread t2 = new Thread(present,"张温婷");

        t1.start();
        t2.start();
    }
}
