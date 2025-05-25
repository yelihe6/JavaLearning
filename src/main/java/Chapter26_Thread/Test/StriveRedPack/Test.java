package Chapter26_Thread.Test.StriveRedPack;

public class Test {

    public static void main(String[] args) {

        RedPack redPack = new RedPack();

        Thread t1  = new Thread(redPack,"姜胜哲");
        Thread t2  = new Thread(redPack,"陈文文");
        Thread t3  = new Thread(redPack,"王以如");
        Thread t4  = new Thread(redPack,"张雪仪");
        Thread t5  = new Thread(redPack,"叶慧乐");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
