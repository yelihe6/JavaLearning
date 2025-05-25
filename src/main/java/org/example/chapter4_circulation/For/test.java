package org.example.chapter4_circulation.For;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a到b求和功能");
        System.out.println("---------");
        System.out.println("请输入a: ");
        int a = sc.nextInt();
        System.out.println("请输入b: ");
        int b = sc.nextInt();
        int num = 0;
        if (a == b){
            System.out.println("数字不能重复!!");
        }else {
//            for (int i = a; i < b ; i++) {
//                a += i + 1;
//            }
//            System.out.println("a到b的求和是: "+a);
            for (int i = a; i <= b ; i++) {
                num += i;
            }
            System.out.println("a到b的求和是: "+num);
        }



    }
}
