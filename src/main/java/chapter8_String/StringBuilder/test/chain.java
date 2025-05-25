package chapter8_String.StringBuilder.test;

import java.util.Scanner;

public class chain {

    public String Chain(String[] arr){
        StringBuilder sb = new StringBuilder("[").append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(",").append(arr[i]);
        }
        sb.append("]");

        return sb.toString();
    }




    public static void main(String[] args) {
        chain chain = new chain();
        Scanner scanner = new Scanner(System.in);
        System.out.println("你需要几个元素?");
        int index = scanner.nextInt();
        String[] arr = new String[index];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            String ele = scanner.next();
            arr[i] = ele;
        }

        String rs = chain.Chain(arr);
        System.out.println("返回:");
        System.out.println(rs);



    }
}
