package chapter8_String.Practise;


import java.util.Scanner;

public class Traversal {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] str1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            str1[i] = c;
            System.out.print(c);
            System.out.print("\t");
        }
    }
}
