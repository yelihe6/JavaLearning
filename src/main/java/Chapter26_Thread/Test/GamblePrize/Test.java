package Chapter26_Thread.Test.GamblePrize;

public class Test {

    public static void main(String[] args) {

        PricePool pricePool = new PricePool();

        Thread t1 = new Thread(pricePool,"奖池1");
        Thread t2 = new Thread(pricePool,"奖池2");

        t1.start();
        t2.start();
    }
}
