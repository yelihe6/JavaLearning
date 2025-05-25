package Chapter26_Thread.Part2;

public class demo {

    public static void main(String[] args) {

        MyRun my = new MyRun();

        Thread t1 = new Thread(my, "t1");
        Thread t2 = new Thread(my, "t2");

        t1.setPriority(10);
        t2.setPriority(1);

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
