package org.example.chapter3_if_and_switch.Switch;

import java.util.Scanner;

/*
    default的位置和省略

    1.位置:   default可以写在任意位置,习惯写在最下面
    2.省略:   default可以省略,一般不建议省略
 */


public class Default {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要做的事情: ");
        String msg = sc.next();
        switch (msg){
            case "去猫咖":
                System.out.println("陪张铭慧去猫咖散心");
                break;
            case "运动":
                System.out.println("陪张铭慧去运动");
                break;
            case "下午茶":
                System.out.println("陪张铭慧去喝下午茶");
                break;
            case "看电影":
                System.out.println("陪张铭慧去看电影");
                break;
            default:
                System.out.println("陪张铭慧散步");
                break;



        }
    }
}
