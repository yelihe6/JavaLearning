package org.example.chapter29_Algorithm.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] array = {131, 77, 88 ,31, 88, 88};
        System.out.println(ElementSearch(array, 88));
    }

    public static List<Integer> ElementSearch(int[] array , int number){
        List<Integer> IndexArray = new ArrayList<>();
        if (array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    IndexArray.add(i);
                }
            }
        }
        return IndexArray;
    }
}
