package org.example.chapter5_list.test;

public class max_number {
    public static void main(String[] args) {

        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
