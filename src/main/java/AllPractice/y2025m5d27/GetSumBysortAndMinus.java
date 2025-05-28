package AllPractice.y2025m5d27;

public class GetSumBysortAndMinus {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(5,1));
    }

    public static int differenceOfSums(int n, int m) {
        //无法被m整除
        int num1 = 0;
        //可以被m整除
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            //允许被m整除
            if (i % m == 0){
                num2+=i;
                //无法被m整除
            }else {
                num1+=i;
            }
        }
        return num1-num2;
    }
}
