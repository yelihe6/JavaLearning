package org.example.Chapter26_Thread.WaitAndNotify;

public class Foddie implements Runnable{
    @Override
    public void run() {
        while (true) {
            synchronized (Table.lock) {
                if (Table.count == 0) {
                    break;
                }else {
                    if (Table.foodFlag == 0) {
                        try {
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        Table.count--;
                        //吃完桌上的一碗面
                        System.out.println("还能吃:"+Table.count+"碗");
                        //唤醒厨师继续做
                        Table.lock.notifyAll();
                        //此时桌上已经没有面
                        Table.foodFlag = 0;
                    }
                }
            }
        }
    }
}
