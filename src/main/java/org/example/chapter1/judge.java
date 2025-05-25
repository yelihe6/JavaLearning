package org.example.chapter1;

import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int num = sc.nextInt();
        if(num%2 == 0 ){
            System.out.println("您输入的数字是: " + num + "此数是偶数");
        }else {
            System.out.println("您输入的数字是: " + num + "此数是奇数");
        }
    }
}
