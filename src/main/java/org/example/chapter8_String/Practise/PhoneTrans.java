package org.example.chapter8_String.Practise;

import java.util.Scanner;

public class PhoneTrans {





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入的你的电话号码:");
        String tel = sc.next();
//        String tel1 = "";
//        String tel2 = "";

        //思路1
        if (tel.length() != 11){
            System.out.println("请输入正确格式的手机号(11位)");
        }else {
            String tel1 = "";
            for (int i = 0; i < 3; i++) {
                char c = tel.charAt(i);
                tel1 += c;
            }

//            System.out.println(tel1);

            String tel2 = "";
            for (int i = tel.length()-4; i < tel.length(); i++) {
                char c = tel.charAt(i);
                tel2 += c;
            }

//            System.out.println(tel2);

            String code = "****";
            String alcode = tel1 + code + tel2;
//            System.out.println(alcode);

        }


        //思路2

        //包头不包尾,包左不包右
        //截取字符串元素
        String tel3 = tel.substring(0,3);
        String tel4 = tel.substring(tel.length()-4);
        String code = "****";

        String alcode = tel3 + code + tel4;
        System.out.println(alcode);



        }










}
