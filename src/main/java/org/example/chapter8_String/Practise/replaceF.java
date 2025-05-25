package org.example.chapter8_String.Practise;

import java.util.Scanner;

public class replaceF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你的信息:");

        String message = sc.next();

        //替换方法
        String get = message.replace("TMD","***")
                .replace("他妈的","***")
                .replace("傻逼","***");
        //此方法可以无限调用



        System.out.println(get);
    }

}
