package org.example.method_test;

import java.util.Scanner;

public class Encode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encode encode = new Encode();
        System.out.println("加密: 请输入你的密码的位数: ");
        int code_count = sc.nextInt();
        if (code_count > 0){
            int [] code = new int[code_count];
//            遍历生成
            for (int i = 0; i < code.length; i++) {
                System.out.println("第"+(i+1)+"位: ");
                code[i] = sc.nextInt();
            }
            //输出数组
            for (int i = 0; i < code.length; i++) {
                System.out.print(code[i]+" ");
            }

//            每位加上5并对10取余
            for (int i = 0; i < code.length; i++) {
                code[i] += 5;
                code[i] %= 10;
            }
//            对10取余
//            String x = "";
//            for (int i = code_count-1; i >= 0; i--) {
//                x += code[i];
//            }
//            int get_number = Integer.parseInt(x) % 10;
            int backward = encode.backward(code);
            System.out.println("加密后的密码: " + backward);
        }else {
            System.out.println("密码位数需要大于0");
        }
    }

    //倒着输出的方法
    public int backward(int[] need){
            String x = "";
            for (int i = need.length-1; i >= 0; i--) {
                x += need[i];
            }
        return Integer.parseInt(x);
    }




}
