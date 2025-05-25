package chapter4_circulation.exercise;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        //判断质数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数: ");
        int num = scanner.nextInt();
        int count = 0;
        if (num == 1){
            System.out.println(false);
        }else {
            for (int i = 1; i <= num; i++) {
                if (num % i != 0){
                    count++;
                }
            }
            System.out.println(count == num - 2);
        }

    }
}
