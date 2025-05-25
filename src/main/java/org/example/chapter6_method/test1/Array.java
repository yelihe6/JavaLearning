package org.example.chapter6_method.test1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Array {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array = new Array();
        System.out.println("数组遍历");
        System.out.println("---------");
        System.out.println("请输入数组的宽度");
        int num = sc.nextInt();
        int[] number = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("第"+(i+1)+"个元素:");
            int ele = sc.nextInt();
            number[i] = ele;
        }
        array.arrayList(number, num);       //遍历数组的方法
    }
    public void arrayList(int[] arrname, int index){
//        arrname = new int[index];
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            if (i == index - 1){
                System.out.print(arrname[i]);
            }else{
                System.out.print(arrname[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
