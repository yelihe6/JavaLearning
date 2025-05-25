package org.example.chapter18_API_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class ReproduceRabbit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份:");


        while (true) {
            int month = scanner.nextInt();
            if (month < 0) {
                System.out.println("月份不能小于0");
                continue;
            }
            Integer[] integers = new Integer[month];
            for (int i = 0; i < month; i++) {
                // initial condition
                if (i == 0 || i == 1) {
                    integers[i] = 1;
                }else {
                    integers[i] = integers[i-1] + integers[i-2];
                }
            }
            Arrays.sort(integers,((o1, o2) -> o1 - o2));
            System.out.println(Arrays.toString(integers));
            return;
        }



    }
}
