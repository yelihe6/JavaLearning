package org.example.chapter4_circulation.exercise;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //逢7过
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("[a,b],a<=b");
            System.out.println("请输入第一个数a: ");
            int a = sc.nextInt();
            System.out.println("请输入第二个数b: ");
            int b = sc.nextInt();
            if (a > b){
                System.out.println("a不能大于b!!");
            }else {
                for (int i = a; i <= b ; i++) {
                        if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7){
                            System.out.println(i + "过!");
                        }
                }
                break;
            }
        }
//        for (int i = a; i <= b ; i++) {
//            if (i/7 == 0 || i%10 == 7){
//
//            }
//        }

//        Math.sqrt();
    }
}
