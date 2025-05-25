package org.example.chapter4_circulation.For;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("a到b求偶数和功能");
        System.out.println("---------");
        System.out.println("请输入a: ");
        int a = sc.nextInt();
        System.out.println("请输入b: ");
        int b = sc.nextInt();
        int num = 0;
        if (a == b){
            System.out.println("数字不能重复!!");
        }else {
//            for (int i = a; i <= b ; i++) {
//                if (i%2 == 0){
//                    num += i;
//                }
//            }
//            System.out.println("a到b的偶数和为: "+num);
            for (int i = a; i <= b ; i++) {
                if (i%3 == 0 && i%5 == 0){
                    System.out.println(i);
                    num += 1;
//                    num++;
                }
            }
            System.out.println("a到b有\t"+num+"\t个既能被3也能被5整除");
        }
    }
}
