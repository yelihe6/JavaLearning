package org.example.Chapter26_Thread.Part2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取当前线程
            System.out.println(Thread.currentThread().getName()+"---"+i+"ありかづう");
        }
    }
}
