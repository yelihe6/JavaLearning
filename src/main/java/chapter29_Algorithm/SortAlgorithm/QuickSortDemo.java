package chapter29_Algorithm.SortAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] array = {4,12,3,9,2,6,8,72,5,37,145,17,45};
        int[] array1 = {6,1,2,7,9,3,4,5,10,8};

        int[] Xarray = new int[100000];
        Random r = new Random();
        for (int i = 0; i < Xarray.length; i++) {
            Xarray[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        QuickSortWay(Xarray,0,Xarray.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void QuickSortWay(int[] array ,int s, int e) {


        if (s >= e){
            return;
        }

        int start = s;
        int end = e;

        //记录基准数
        int baseNumber = array[s];



        //从左往右找比基准数大的数字
        //从右往左找比基准数小的数字
        while (start != end){
            //利用end从后往前找
            while (true){
                if (end <= start || array[end] < baseNumber){
                    break;
                }
                end--;
            }
            //利用start从前往后找
            while (true){
                if (end <= start || array[start] > baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }

        int temp = array[s];
        array[s] = array[start];
        array[start] = temp;
        QuickSortWay(array,s,start-1);
        QuickSortWay(array,start+1,e);
    }
}
