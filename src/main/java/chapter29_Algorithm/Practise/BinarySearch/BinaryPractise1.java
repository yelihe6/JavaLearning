package chapter29_Algorithm.Practise.BinarySearch;

import java.util.Arrays;
import java.util.Random;

public class BinaryPractise1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(array));
        int index = binarySearch(array, 15);
        System.out.println(index);


    }

    public static int binarySearch(int[] array, int i) {
        int middle = (array.length - 1) / 2;
        if (i < array[middle]) {
            for (int j = 0; j < middle; j++) {
                if (i == array[j]) {
                    return j;
                }
            }
        } else if (i > array[middle]) {
            for (int j = middle + 1; j < array.length; j++) {
                if (i == array[j]) {
                    return j;
                }
            }
        } else {
            return middle;
        }
        return -1;

    }
}

