package org.example.chapter3_if_and_switch.Switch;

import java.util.Scanner;

/*
    case穿透
        就是语句中没有执行break导致的
*/

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要做的事情: ");
        String msg = sc.next();
        switch (msg){
            case "去猫咖":
                System.out.println("陪张铭慧去猫咖散心");
                //break;
                break;
            case "运动":
                System.out.println("陪张铭慧去运动");
                //break;
                break;
            case "下午茶":
                System.out.println("陪张铭慧去喝下午茶");
                //break;
                break;
            case "看电影":
                System.out.println("陪张铭慧去看电影");
                //break;
                break;
            default:
                System.out.println("陪张铭慧散步");
                //break;
                break;



        }
    }
}
