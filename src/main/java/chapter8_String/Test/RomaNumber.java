package chapter8_String.Test;

import java.util.Scanner;

public class RomaNumber {


    public String RomaNum(char index){
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[index-48];
    }





    public static void main(String[] args) {
        RomaNumber romaNumber = new RomaNumber();
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("请输入你的数字:");
            input = sc.next();
            if (input.length()<=9){
//                System.out.println(input);
                break;
            }else {
                System.out.println("数字长度过长,请重新输入.");
            }
        }

//        System.out.println(input);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
//            System.out.println(index);
            sb.append(romaNumber.RomaNum(index));
        }

        String get = sb.toString();
        System.out.println(get);






    }
}
