package chapter4_circulation.While;

import java.util.Scanner;

public class Back_Number {
    public static void main(String[] args) {
        //回文数
        //核心思路: 把数字倒过来跟原来的数字进行对比
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的数字");
        int num = sc.nextInt();
        //定义一个中间变量存储num变量
        int temp = num;
        //定义变量存储最终结果
        int x = 0;

        while (num != 0){
            //获取个位数
            int a = num % 10;
            //获取下一次循环需要的值
            num /= 10;
            //每次在原基础上乘10加上个位数,构成循环
            x = x * 10 + a;
        }
        //变化完后的值同存储起来的变量比较
        System.out.println(x == temp);
    }



}
