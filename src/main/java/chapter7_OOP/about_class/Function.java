package chapter7_OOP.about_class;

public class Function {

    private String name;
    private int age;
    private String gender;



    public static int find_prime(int origin, int bound){

//        构造以origin和bound为边界的数组
        int[] arr = new int[bound - origin + 1];
        int temp = origin;
        int b = 0;
        for (int i = 0; i < bound - temp + 1; i++) {
            arr[i] = origin;
//            System.out.print(origin + "\t");
            origin++;
        }
//        boolean a = true;

//        判断是否是质数并输出它
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j != 0){
                    count++;
                }
            }
            if (count == (arr[i] - 2)){
                b++;
                System.out.print(arr[i] + " ");
            }
//            System.out.println(arr[i]);

        }
        System.out.print("]");
//        int [] result = new int[b];
//        for (int i = 0; i < ; i++) {
//
//        }
//        返回质数数量
        return b;
    }


}
