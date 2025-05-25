package chapter8_String.Practise;

import chapter8_String.StringAPI.StringApp;

import java.util.Scanner;

public class StringOp {




    public boolean operation(String stringA,String stringB) {
        for (int i = 0; i < stringA.length(); i++) {
            stringA = getA(stringA);
            if (stringA.equals(stringB)){
                return true;
            }
        }
        return false;
    }

    public String getA(String stringA){
        String sub = stringA.substring(1);
        String get = sub + stringA.charAt(0);
        return get;
    }

    public static void main(String[] args) {
        StringOp stringOp = new StringOp();
        Scanner sc = new Scanner(System.in);
        System.out.println("字符串A:");
        String strA = sc.next();
        System.out.println("字符串B:");
        String strB = sc.next();
        boolean flag = false;
        for (int i = 0; i < strA.length(); i++) {
            for (int j = 0; j < strB.length(); j++) {
                if (strA.charAt(i) == strB.charAt(j)){
                    flag = true;
                }
            }
        }
        if (strA.length() != strB.length()){
            System.out.println("长度必须相同!");
        }else {
            if (flag){
                try {
                    System.out.println(stringOp.operation(strA,strB));
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("false");
                }
            }else {
                System.out.println("字符串元素不相同");
            }
        }

    }
}
