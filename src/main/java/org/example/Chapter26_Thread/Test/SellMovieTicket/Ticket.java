package org.example.Chapter26_Thread.Test.SellMovieTicket;

public class Ticket implements Runnable{

    static int count = 0;

    static final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (count == 1000 ) {
                    break;
                }else {
                    count++;
                    System.out.println(Thread.currentThread().getName()
                    +"正在售出第"+count+"张票");
                }
            }
        }
    }
}
