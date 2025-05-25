package org.example.chapter8_String.StringAPI;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = "bbc";
//        String s4 = "adc";
//
//        String s5 = new String("abc");
//
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1.equals(s5));
//        System.out.println(s1 == s5);
//        // 忽略大小写(验证码场景)
//        System.out.println(s1.equalsIgnoreCase(s5));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();     //被new出来的
        String str1 = "abc";
        System.out.println(str.equals(str1));

//        结论:
//        以后要用到比较字符串内容一律使用String当中的.equals方法


    }
}
