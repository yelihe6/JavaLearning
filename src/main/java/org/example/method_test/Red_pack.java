package org.example.method_test;

import java.util.Random;

public class Red_pack {
    public static void main(String[] args) {
        Random r = new Random();
        //可以自己设定奖池
        int[] money = {2, 588, 888, 1000, 10000};

        for (int i = 0; i < money.length; i++) {
            int rand = r.nextInt(money.length);
            int temp = money[i];
            money[i] = money[rand];
            money[rand] = temp;
        }
        for (int i = 0; i < money.length; i++) {
            System.out.print(money[i] + " ");
        }


    }
}
