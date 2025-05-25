package chapter29_Algorithm.SortAlgorithm;

import java.util.Arrays;

public class InsertionSortDemo2 {
    public static void main(String[] args) {
        int[] array = {4,12,3,9,2,6,8,72,5,37,145,17,45};

        InsertionSortWay2(array);

    }

    public static void InsertionSortWay2(int[] array) {
        int start = array[0];
        int[] newArray = new int[array.length];
        newArray[0] = start;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < start){
//                for (int i1 = 0; i1 < array.length-1; i1++) {
//                    newArray[i1+1] = newArray[i1];
//                }
                if (i == 1){
                    newArray[i] = start;
                }else {
                    for (int j = i-1; j > 0; j--) {
                        if (newArray[j]>newArray[j-1]){
                            for (int i1 = j; i1 < array.length-1; i1++) {
                                newArray[i1+1] = newArray[i1];
                            }
                            newArray[j] = array[i];
                        }
                    }

                }
            }else {
                if (i == 1) {
                    newArray[i] = array[i];
                }else {
                for (int j = i; j < newArray.length-1; j++) {
                    if (newArray[j]<newArray[j+1]){
                        for (int i1 = j; i1 < array.length-1; i1++) {
                            newArray[i1+1] = newArray[i1];
                        }
                        newArray[j] = array[i];
                    }
                }
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
