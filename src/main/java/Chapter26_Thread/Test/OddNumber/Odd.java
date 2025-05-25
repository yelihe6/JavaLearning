package Chapter26_Thread.Test.OddNumber;

public class Odd implements Runnable{

    static int count = 0;

    static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (Odd.class) {
                count++;
                if (count > 100) {
                    break;
                }
                if (count % 2 != 0) {
                    System.out.println(count);
                }
            }
        }
    }
}
