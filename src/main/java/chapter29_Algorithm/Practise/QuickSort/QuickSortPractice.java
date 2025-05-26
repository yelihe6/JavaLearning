package chapter29_Algorithm.Practise.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortPractice {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10,200);
        }
        Long startTime = System.currentTimeMillis();
        quickSortPractise(array,0,array.length-1);
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSortPractise(int[] array, int s, int e) {

        //判断结束条件
        if (s>=e){
            return;
        }
        //记录开始与结束节点
        int start = s;
        int end = e;


        //基准数归位
        int baseNumber = array[s];

        while (start < end){
            while (true){
                if (end <= start ||array[end] < baseNumber){
                    break;
                }
                end--;
            }
            while (true){
                if (end <= start || array[start] > baseNumber){
                    break;
                }
                start++;
            }
            //替换数据
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
        }
        //基准数归位
        int temp = array[start];
        array[start] = array[s];
        array[s] = temp;
        //左边的递归
        quickSortPractise(array,s,start-1);
        //右边的递归
        quickSortPractise(array,start+1,e);
    }
}
