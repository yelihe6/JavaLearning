package org.example.chapter29_Algorithm.SortAlgorithm;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {

        int[] array = {4,1,3,9,2,6,8,2,5};

        int[] result = SelectionSortWay(array);
        System.out.println(Arrays.toString(result));
        System.out.println(result);
        System.out.println(array);
    }

    private static int[] SelectionSortWay(int[] array) {
        //只进行n-1轮游戏
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
