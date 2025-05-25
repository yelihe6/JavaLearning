package org.example.Chapter25_IO.ThreadPool.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {

    public static void main(String[] args) {

        //获取线程池子对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //提交任务
        pool1.submit(new MyRunnable());

        //
        pool1.shutdown();
    }
}
