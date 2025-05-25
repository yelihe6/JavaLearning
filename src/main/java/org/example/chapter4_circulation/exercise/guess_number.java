package org.example.chapter4_circulation.exercise;

import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
//        Random r = new Random();
//        int num1 = r.nextInt(1, 100);
        Scanner sc = new Scanner(System.in);
        int guess = (int) (100 * Math.random());
        int count = 0;
        while (true){
            System.out.println("请输入一个数字");
            int num = sc.nextInt();
            if (num < guess){
                System.out.println("猜小啦!");
                count++;
            }else if (num > guess) {
                System.out.println("猜大啦!");
                count++;
            }else {
                System.out.println("猜中啦");
                System.out.println("你猜了: " + count + "次");
                break;
            }

        }

    }
}
