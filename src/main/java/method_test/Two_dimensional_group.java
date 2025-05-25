package method_test;

public class Two_dimensional_group {
    public static void main(String[] args) {

        int[][] cost = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}};

        //第一季度:
        int sum1 = 0 ;
        for (int i = 0; i < cost[0].length; i++) {
            sum1 += cost[0][i];
        }
        System.out.println("sum1"+"="+sum1);
        //第二季度:
        int sum2 = 0 ;
        for (int i = 0; i < cost[1].length; i++) {
            sum2 += cost[1][i];
        }
        System.out.println("sum2"+"="+sum2);
        //第三季度:
        int sum3 = 0 ;
        for (int i = 0; i < cost[2].length; i++) {
            sum3 += cost[2][i];
        }
        System.out.println("sum3"+"="+sum3);
        //第四季度:
        int sum4 = 0 ;
        for (int i = 0; i < cost[3].length; i++) {
            sum4 += cost[3][i];
        }
        System.out.println("sum4"+"="+sum4);

//        总和
        int Sum = 0;
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[i].length; j++) {
                Sum += cost[i][j];
            }
        }
        System.out.println("Sum"+"="+Sum);

    }
}
