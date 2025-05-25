package org.example.chapter23_Exception.Demo;

import java.util.Scanner;

public class exponential {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isTwoExponential(num));

    }
    public static Boolean isTwoExponential(int num) {
        if (num % 2 == 0) {
            int n = num / 2;
            return isTwoExponential(n);
        }else if (num == 1){
            return true;
        }
        return false;
    }
}
