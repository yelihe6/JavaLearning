package chapter8_String.Practise;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的字符串:");
        String get = sc.next();
        int x = 0;  //大写字母
        int y = 0;  //小写字母
        int z = 0;  //数字
        for (int i = 0; i < get.length(); i++) {
            char c = get.charAt(i);
            byte b = (byte) c;
//            System.out.println(b);
            if (b>=65 && b<=90){
                x++;        //大写字母
            }
            if (b>=97 && b<=122){
                y++;        //小写字母
            }
            if (b>=48 && b<=57){
                z++;        //数字
            }
        }
        System.out.println("大写字母有:"+x+"个");
        System.out.println("小写字母有:"+y+"个");
        System.out.println("数字有:"+z+"个");
    }
}
