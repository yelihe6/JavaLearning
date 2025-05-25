package org.example.Chapter26_Thread.Synchronization;

public class Mission implements Runnable{

    static int tickets = 0;

    static Object obj = new Object();

    @Override
    public void run() {
            while (true) {
                synchronized (Mission.class) {
                    if (tickets < 100) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        tickets++;
                        String name = Thread.currentThread().getName();
                        System.out.println(name+"正在售第"+tickets+"张票");
                    }else {
                        break;
                    }
                }
            }
    }
}
