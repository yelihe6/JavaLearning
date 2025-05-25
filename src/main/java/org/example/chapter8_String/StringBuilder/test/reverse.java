package org.example.chapter8_String.StringBuilder.test;

import java.util.Scanner;

public class reverse {

    //回文数进阶版
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字");
        String number = sc.next();

//        StringBuilder sb = new StringBuilder(number).reverse();
//
//        String sbStr = sb.toString();

        String sbStr = new StringBuilder(number).reverse().toString();


        if (number.equals(sbStr)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }






    }





}
