package chapter29_Algorithm.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertionSortDemo {
    public static void main(String[] args) {
//        int[] array = {4,12,3,9,2,6,8,72,5,37,145,17,45};
//
//        List<Integer> result = InsertionSortWay(array);
//        System.out.println(result);

        int[] Xarray = new int[100000];
        Random r = new Random();
        for (int i = 0; i < Xarray.length; i++) {
            Xarray[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        InsertionSortWay(Xarray);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static List<Integer> InsertionSortWay(int[] array) {
        List<Integer> group1 = new ArrayList<>();
        List<Integer> group2 = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i+1]){
                group1.add(array[i]);
            } else if (array[i] > array[i+1]) {
                group1.add(array[i]);
                k = i+1;
                break;
            }
        }
        for (int i = k; i < array.length ; i++) {
            group2.add(array[i]);
        }
        //已经获得分组后的数据
        for (int i = 0; i < group2.size(); i++) {
            if (group2.get(i) >= group1.get(group1.size()-1)){
                group1.add(group1.size(),group2.get(i));
            }else {
                for (int j = group1.size()-1; j >= 1; j--) {
                    if (group2.get(i)<group1.get(j) && group2.get(i)>group1.get(j-1)){
                        group1.add(j,group2.get(i));
                        break;
                    }
                }
            }

        }



        return group1;
    }
}
