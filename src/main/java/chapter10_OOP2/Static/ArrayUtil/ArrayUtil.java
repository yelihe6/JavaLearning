package chapter10_OOP2.Static.ArrayUtil;

import java.util.StringJoiner;

public class ArrayUtil {

    private ArrayUtil(){}

    //返回整数数组的内容
    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(""+arr[i]+"");
        }
        return sj.toString();
    }

    public static int getAverage(double[] arrd){
        int sum = 0;
        for (int i = 0; i < arrd.length; i++) {
            sum += arrd[i];
        }
        return sum/4;
    }

}
