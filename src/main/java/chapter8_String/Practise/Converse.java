package chapter8_String.Practise;

import java.util.Scanner;

public class Converse {
    //反转字符串
    //封装
    public String converse(String string){
        char[] Catch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            Catch[string.length()-1-i] = c;
        }
        String ConStr = new String(Catch);
        return ConStr;
    }
    public static void main(String[] args) {
        Converse conver = new Converse();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的字符串");
        String string = sc.next();
        String get = conver.converse(string);
        System.out.println("反转后:"+get);
    }
}
