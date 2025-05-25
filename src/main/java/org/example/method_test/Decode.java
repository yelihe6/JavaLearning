package org.example.method_test;

import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decode decode = new Decode();
        System.out.println("解密: 请输入你的密码的位数: ");
        int code_count = sc.nextInt();
        if (code_count > 0){
            int [] code = new int[code_count];
//            遍历生成
            for (int i = 0; i < code.length; i++) {
                System.out.println("第"+(i+1)+"位: ");
                code[i] = sc.nextInt();
            }
            //输出数组
            for (int j : code) {
                System.out.print(j + " ");
            }

            for (int i = 0; i < code.length; i++) {
                if (code[i] <= 4 && code[i] > 0){
                    code[i] += 5;
                }else if (code[i] <= 9 && code[i] > 4){
                    code[i] -= 5;
                }
            }

            int result = decode.backward(code);
            System.out.println("解密后的密码: " + result);

    }else {
            System.out.println("密码位数需要大于0");
        }
    }


    public int backward(int[] need){
        String x = "";
        for (int i = need.length-1; i >= 0; i--) {
            x += need[i];
        }
        return Integer.parseInt(x);
    }


}
