package org.example.chapter5_list.test;

import java.util.Random;

public class mess {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int rand = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
