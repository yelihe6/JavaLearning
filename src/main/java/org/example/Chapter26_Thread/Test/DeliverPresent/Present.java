package org.example.Chapter26_Thread.Test.DeliverPresent;

public class Present implements Runnable{

    static int gift = 100;

    static Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (Present.class) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (gift < 10 ){
                    System.out.println();
                    break;
                }else {
                    gift--;
                    System.out.println(Thread.currentThread().getName()
                    +"送出一份礼物,还剩"+gift+"份");
                }
            }
        }
    }
}
