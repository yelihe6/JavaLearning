package org.example.Chapter26_Thread.Test.OddNumber;

public class Test {

    public static void main(String[] args) {


        Odd odd = new Odd();

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(odd);


        t1.start();
        t2.start();
    }
}
