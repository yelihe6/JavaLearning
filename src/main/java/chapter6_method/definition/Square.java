package chapter6_method.definition;

import java.util.Scanner;

public class Square {

    public void sqr(int length, int width){
            int squ = length * width;
            System.out.println(squ);
    }

    public static void main(String[] args) {
        Square square = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个正数");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("面积是: ");
        square.sqr(x,y);
//        int num = S     没有返回值的方法无法存储调用后输出的变量
    }
}
