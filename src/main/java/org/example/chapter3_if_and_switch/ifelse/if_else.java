package org.example.chapter3_if_and_switch.ifelse;

import java.util.Scanner;

public class if_else {


    public void divide(int num){
        if(num%2 == 0){
            if (num%3 == 0 && num%4 == 0){
                System.out.println("该数字是偶数,且能被3和4整除");
            } else if (num%3 == 0 || num%4 == 0) {
                if (num%3 ==0){
                    System.out.println("该数字是偶数,且能被3整除,不能被4整除");
                }else {
                    System.out.println("该数字是偶数,且能被4整除,不能被3整除");
                }
            }else {
                System.out.println("该数字是偶数,既不能被4整除,也不能被3整除");
            }
        }else {
            System.out.println("该数字是奇数");
        }
    }
    public static void main(String[] args) {
       if_else ifElse = new if_else();
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
       int num = sc.nextInt();
       ifElse.divide(num);
    }
}
