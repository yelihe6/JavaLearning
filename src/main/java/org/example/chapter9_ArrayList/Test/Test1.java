package org.example.chapter9_ArrayList.Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<>();
        System.out.println("请输入你的元素个数");
        int count = sc.nextInt();

        //for循环添加元素
        for (int i = 0; i < count; i++) {
            System.out.println("第"+(i+1)+"个元素");
            String NameIn = sc.next();
            Name.add(NameIn);
        }

        System.out.println(Name);

        //for循环遍历集合
        //tips : StringJoiner(",","[","]")
        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
        for (int i = 0; i < Name.size(); i++) {
            //  字符串拼接
//            if (i == 0){
//                System.out.print("["+Name.get(i));
//            } else if (i > 0 && i < Name.size()-1) {
//                System.out.print(", "+Name.get(i));
//            }else {
//                System.out.print(", "+Name.get(i)+"]");
//            }
            stringJoiner.add(Name.get(i));

        }
        String rs  = stringJoiner.toString();
        System.out.println(rs);

    }
}
