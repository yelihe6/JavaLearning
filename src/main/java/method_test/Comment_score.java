package method_test;

import java.util.Scanner;

public class Comment_score {

    public static void main(String[] args) {

        Comment_score commentScore = new Comment_score();
        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
        int[] hosts = new int[6];
        int total = 0;
        for (int i = 0; i < hosts.length; i++) {
            System.out.println("第"+(i+1)+"位评委的分数: ");
            hosts[i] = sc.nextInt();
            if (hosts[i] >= 1 && hosts[i] <= 100){
                total += hosts[i];
            }else {
                System.out.println("分数输入不合规!");
                i--;
            }
        }

        int Max = commentScore.Max(hosts);
        int Min = commentScore.Min(hosts);

        int Score = (total - Max - Min)/(6 - 2);

        System.out.println("该选手最终成绩是: "+ Score);



    }
    //定义数组求最大值最小值方法

    public int Max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j >= max) {
                max = j;
            }
        }
        return max;
    }
    public int Min(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j <= min) {
                min = j;
            }
        }
        return min;
    }


}
