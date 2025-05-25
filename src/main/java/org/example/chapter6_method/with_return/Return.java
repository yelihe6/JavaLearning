package org.example.chapter6_method.with_return;

public class Return {
    public static void main(String[] args) {
        int num = Sum(33, 55);
//        System.out.println(num);
        String romance = msg("张铭慧");
        System.out.println(romance);
    }


    //返回整数类型
    public static int Sum(int x, int y){
        int c = x + y;
        return c;
    }
    //返回字符串
    public static String msg(String name){
        String message = name + "正漫步在满是金黄麦穗的原野之上";
        return message;
    }
}
