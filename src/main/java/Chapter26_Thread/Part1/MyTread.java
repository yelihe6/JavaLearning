package Chapter26_Thread.Part1;

public class MyTread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"我爱应鑫榆~");
        }
    }
}
