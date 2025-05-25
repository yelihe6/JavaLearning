package org.example.chapter3_if_and_switch.Switch.NewCharacter_test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎拨打航班客服");
        System.out.println("-------------");
        System.out.println("请拨号以选择服务: ");
        System.out.println("1: 机票查询");
        System.out.println("2: 机票预定");
        System.out.println("3: 机票改签");
        System.out.println("4: 退出服务");
        int num = sc.nextInt();
        switch (num){
            case 1 -> System.out.println("您已选择机票查询");
            case 2 -> System.out.println("您已选择机票预定");
            case 3 -> System.out.println("您已选择机票改签");
            default -> System.out.println("您已选择退出服务");
        }
    }
}
