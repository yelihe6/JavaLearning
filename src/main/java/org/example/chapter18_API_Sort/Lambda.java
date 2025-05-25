package org.example.chapter18_API_Sort;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};


//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });

        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                return o1-o2;
            }
        );
        System.out.println(Arrays.toString(arr));
    }
}
