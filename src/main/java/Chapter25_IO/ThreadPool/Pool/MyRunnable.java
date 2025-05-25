package Chapter25_IO.ThreadPool.Pool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i+"---想要张温绮的第一次");
        }
    }
}
