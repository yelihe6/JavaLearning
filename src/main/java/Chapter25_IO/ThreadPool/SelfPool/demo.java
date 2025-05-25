package Chapter25_IO.ThreadPool.SelfPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class demo {

    public static void main(String[] args) {

        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                3, //核心线程数量
                6, //最大线程数量  临时线程  = 最大 - 核心
                60, //临时线程存活数值
                TimeUnit.SECONDS, //存货单位
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(), //创建线程工厂
                new ThreadPoolExecutor.AbortPolicy() //拒绝策略
        );

        tpe.submit(new MyRunnable());

    }
}
