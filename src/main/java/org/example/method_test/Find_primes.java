package org.example.method_test;


import java.util.Scanner;

public class Find_primes {



    public static void main(String[] args) {
        Find_primes findPrimes = new Find_primes();
        Scanner sc = new Scanner(System.in);
        System.out.println("找质数功能: ");
        System.out.println("-----------");
        System.out.println("请输入范围的起始数: ");
        int origin = sc.nextInt();
        System.out.println("请输入范围的末尾数: ");
        int bound = sc.nextInt();
        int count = findPrimes.find_prime(origin, bound);
        System.out.println("共有"+count+"个质数");
    }

    public int find_prime(int origin, int bound){

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
