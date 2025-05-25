package org.example.chapter4_circulation.exercise;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int num = sc.nextInt();
//        double Sqrt =  Math.sqrt(num);
//        int result = (int) Sqrt;
//        System.out.println(result);
        int i = 1;
        double num1 = 1;
        while (num1 <= num){
            i++;
            num1 = Math.pow(i, 2);
        }
        System.out.println(num+"的平方根是:"+(i-1));
    }
}
