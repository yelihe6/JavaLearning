package chapter6_method.with_return;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Comparison comparison = new Comparison();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        double leng1 = sc.nextInt();
        double leng2 = sc.nextInt();
        double width1 = sc.nextInt();
        double width2 = sc.nextInt();
        double rectangular1 = comparison.Square(leng1,width1);         //封装好的方法,调用即可,自动计算其面积
        double rectangular2 = comparison.Square(leng2,width2);
        if (rectangular1 > rectangular2){
            System.out.println("第一个长方形大");
        }else if (rectangular1 == rectangular2){
            System.out.println("一样大");
        }else {
            System.out.println("第二个长方形大");
        }
    }

    public double Square(double length, double width){
        double square = length * width;
        return square;
    }
}
