package chapter8_String.Practise;

import java.util.Scanner;

public class ImLogin {
    public static void main(String[] args) {
        //正确的账号密码
        String UserCount = "201484365";
        String UserPwd = "zwq050726";

        //模拟用户登录 输错超过三次会冒出提示
        Scanner sc = new Scanner(System.in);
        System.out.println("用户登录--------");
        System.out.println("输入你的账号密码");


        for (int i = 3; i >= 0 ; i--) {
            if (i > 0){
                System.out.println("第"+(4-i)+"次输入~~~");
                System.out.println("输入你的账号:");
                String inCount = sc.next();
                System.out.println("输入你的密码:");
                String inPwd = sc.next();
                if (inCount.equals(UserCount) && inPwd.equals(UserPwd)){
                    System.out.println("登陆成功!!");
                    break;
                }else{
                    System.out.println("账号或者密码输入错误!!");
                }
            } else {
                System.out.println("您输错已达到三次,请稍后尝试输入.");

            }


        }


    }
}
