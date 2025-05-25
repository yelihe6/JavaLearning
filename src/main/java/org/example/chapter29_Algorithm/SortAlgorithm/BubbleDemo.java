package org.example.chapter29_Algorithm.SortAlgorithm;

import java.util.Arrays;
import java.util.List;

public class BubbleDemo {
    //O(n^2)
    public static void main(String[] args) {
     int[] array = {4,1,3,9,2,6,8,2,5};

     //List<Integer>
     int[] result = BubbleWay(array);
        System.out.println(Arrays.toString(result));

    }

    private static int[] BubbleWay(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <= array.length-i; j++) {
                if (j!=array.length-i){
                    if (array[j] > array[j+1]){
                        //交换
                        int prep = array[j+1];
                        array[j+1] = array[j];
                        array[j] = prep;
                    }
                }
            }
        }
        return array;
    }
}
