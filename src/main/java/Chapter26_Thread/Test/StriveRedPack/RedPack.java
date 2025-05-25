package Chapter26_Thread.Test.StriveRedPack;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RedPack implements Runnable{

    static double money = 100.00;

    static int count = 3;

    static final double MIN = 0.01;

    @Override
    public void run() {
//        while (true) {
            synchronized (RedPack.class){
                if ( count == 0 ){
                    System.out.println(Thread.currentThread().getName()
                            +"没抢到!!");
                }else {
                    if ( count > 1 ) {
                        Random r = new Random();
                        double v = r.nextDouble(MIN, money-(count-2) * MIN);
                        BigDecimal bd = new BigDecimal(v).setScale(2, RoundingMode.HALF_UP);
                        double res = bd.doubleValue();
                        money = money - res;
                        count--;
                        System.out.println(Thread.currentThread().getName()
                                + "抢到了" + res + "元");
                    }else {
                        BigDecimal bd1 = new BigDecimal(money).setScale(2, RoundingMode.HALF_UP);
                        double res1 = bd1.doubleValue();
                        System.out.println(Thread.currentThread().getName()
                                + "抢到了" + res1 + "元");
                        money = 0;
                        count -= 1;
                    }
                }
            }
//        }
    }
}
