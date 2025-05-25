package chapter3_if_and_switch.Switch;

import java.util.Scanner;

/*
    switch新特性
    JDK12及以上
 */

public class NewCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要做的事情: ");
        String msg = sc.next();
            // 不需要break语句
            // 若只有一行代码,则大括号可以省略
        switch (msg){
            case "去猫咖" -> System.out.println("陪张铭慧去猫咖散心");
            case "去运动" -> System.out.println("陪张铭慧去运动");
            case "下午茶" -> System.out.println("陪张铭慧去喝下午茶");
            case "看电影" -> System.out.println("陪张铭慧去看电影");
            default -> System.out.println("陪张铭慧去散步");
        }


    }

}
