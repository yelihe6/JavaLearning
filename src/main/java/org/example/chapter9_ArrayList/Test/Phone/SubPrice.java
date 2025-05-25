package org.example.chapter9_ArrayList.Test.Phone;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class SubPrice {

    public static void Res(int Min,int Max,ArrayList<Phone> phones){
        //本质还是StringBuilder
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (Phone phone: phones) {
            if (Min <= phone.getPrice() && Max >= phone.getPrice()){
                stringJoiner.add("("+phone.getBrand()+":"+phone.getPrice()+")");
            }
        }
        if (stringJoiner.length() == 2){
            System.out.println("没有在这一价位之间的手机品牌");
        }else {
            System.out.println(stringJoiner);
        }
    }





    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //设置对象
        Phone phone1 = new Phone(1000,"荣耀X30");
        Phone phone2 = new Phone(2000,"魅族pro");
        Phone phone3 = new Phone(3000,"红米K60");
        Phone phone4 = new Phone(4000,"iPhone12");
        Phone phone5 = new Phone(5000,"iPhone13");
        Phone phone6 = new Phone(6000,"华为 mate X50");
        Phone phone7 = new Phone(7000,"华为 mate 60");
        Phone phone8 = new Phone(8000,"iPhone14pro");
        Phone phone9 = new Phone(9000,"iPhone15pro");
        Phone phone10 = new Phone(10000,"iPhone15pro max");

        //添加
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        phones.add(phone6);
        phones.add(phone7);
        phones.add(phone8);
        phones.add(phone9);
        phones.add(phone10);


        System.out.println("请输入你想查询的价位区间");
        int Min = sc.nextInt();
        System.out.println("~");
        int Max = sc.nextInt();

        Res(Min,Max,phones);

    }
}
