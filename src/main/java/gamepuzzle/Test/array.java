package gamepuzzle.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringJoiner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[16];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
//        ArrayList<StringJoiner> res = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ran1 = random.nextInt(arr.length);
            int ran2 = random.nextInt(arr.length);
            int temp  = arr[ran1];
            arr[ran1] = arr[ran2];
            arr[ran2] = temp;
        }
        StringJoiner stringJoiner1 = new StringJoiner(",","{","}");
        StringJoiner[] res = new StringJoiner[4];
//        int k = 0;
        int[][] rs = new int[4][4];
        for (int i = 0; i < rs.length; i++) {
            StringJoiner stringJoiner = new StringJoiner(",","{","}");
            for (int j = 0; j < rs[i].length; j++) {
                rs[i][j] = arr[4*i+j];
                res[i] = stringJoiner.add(""+rs[i][j]);
            }
            stringJoiner1.add(res[i].toString());
//            k++;
        }



//        for (StringJoiner re : res) {
//            System.out.println(re);
//        }
//        System.out.println(stringJoiner1);

        for (int[] ele : rs) {
            for (int j : ele) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
