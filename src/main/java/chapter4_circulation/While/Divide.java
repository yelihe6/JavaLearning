package chapter4_circulation.While;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个正数:");
        int b = sc.nextInt();
        int temp = b;       //存储静止变量
        int count = 1;

        if (a < b){
            System.out.println("a/b商: "+(0));
            System.out.println("a/b余数: " + (a));
        }else {
            while (b < a) {
                // b的逐次累加大于 a-原来b 的长度
                if (b > a - temp) {
                    break;
                } else {
                    b += temp;
                    count++;
                }
            }
            System.out.println("a/b商: "+count);
            System.out.println("a/b余数: " + (a-b));
        }


        }
}
