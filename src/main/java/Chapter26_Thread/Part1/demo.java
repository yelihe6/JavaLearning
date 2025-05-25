package Chapter26_Thread.Part1;

public class demo extends Thread{

    public static void main(String[] args) {

        MyTread m1 = new MyTread();
        MyTread m2 = new MyTread();

        m1.setName("永远");
        m2.setName("forever");

        m1.start();
        m2.start();
    }
}
