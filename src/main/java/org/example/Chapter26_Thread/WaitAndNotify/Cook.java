package org.example.Chapter26_Thread.WaitAndNotify;

public class Cook implements Runnable{
    @Override
    public void run() {
        while (true) {
            synchronized (Table.lock) {
                if (Table.count == 0) {
                    break;
                }else {
                    if (Table.foodFlag == 0) {
                        //做面

                        //厨师做好了面
                        System.out.println("厨师已经做好了第"+(11-(Table.count))+"碗");
                        //唤醒吃货继续吃
                        Table.lock.notifyAll();
                        //此时桌上已经有面
                        Table.foodFlag = 1;
                    }else {
                        try {
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
