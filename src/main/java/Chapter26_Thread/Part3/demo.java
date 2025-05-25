package Chapter26_Thread.Part3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {



        MyCallable mc = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        System.out.println(ft.get());
    }
}
