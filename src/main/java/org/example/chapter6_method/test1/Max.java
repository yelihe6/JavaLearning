package org.example.chapter6_method.test1;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Max max = new Max();
        System.out.println("数组遍历求最大值");
        System.out.println("-------------");
        System.out.println("请输入数组的宽度");
        int width = sc.nextInt();
        int[] number = new int[width];
        for (int i = 0; i < width; i++) {
            System.out.println("第"+(i+1)+"个元素:");
            int ele = sc.nextInt();
            number[i] = ele;
        }
        int result = max.maximum(number);
        System.out.println("该数组的最大值是: " + result);
    }

    public int maximum(int[] compare){
        int max = compare[0];
        for (int i = 1; i < compare.length; i++) {
            if (compare[i] >= max){
                max = compare[i];
            }
        }
        return max;
    }




}
