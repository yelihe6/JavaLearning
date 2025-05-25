package org.example.Chapter26_Thread.Synchronization;

public class demo {

    public static void main(String[] args) {

        Mission mi = new Mission();

        Thread t1 = new Thread(mi,"窗口一");
        Thread t2 = new Thread(mi,"窗口二");
        Thread t3 = new Thread(mi,"窗口三");

        t1.start();
        t2.start();
        t3.start();


    }
}
