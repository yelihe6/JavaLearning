package org.example.chapter29_Algorithm.Practise.Bubble.BubblePractise1;

import java.util.Arrays;
import java.util.Random;

public class Practise1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(10,100);
        }
        System.out.println(Arrays.toString(array));
        int[] res1 = Bubble(array);
        int[] res2 = Selection(array);
        System.out.println("冒泡排序:"+Arrays.toString(res1));
        System.out.println("选择排序:"+Arrays.toString(res2));
        System.out.println(res1[0]);
        System.out.println(res1[res1.length-1]);
    }

    //冒泡排序
    public static int[] Bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    //选择排序
    public static int[] Selection(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
