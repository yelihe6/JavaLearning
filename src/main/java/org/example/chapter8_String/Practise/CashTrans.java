package org.example.chapter8_String.Practise;

import java.util.Scanner;

public class CashTrans {


    public static void main(String[] args) {
        CashTrans cashTrans = new CashTrans();
        Scanner sc = new Scanner(System.in);
//        ctrl+alt+t
        int cash;
        while (true) {
            System.out.println("请输入一个金额:");
            cash = sc.nextInt();
            if (cash >= 0 && cash <= 9999999){
                break;
            }else {
                System.out.println("金额无效,不符合规范");
            }
        }

        //定义字符串拼接
        String get = "";
        //尝试得到cash中的每一位数字
        while (true){
            //从右往左获取数据
            int integer = cash % 10;
            String capitalNumber = cashTrans.getCapitalNumber(integer);
            get = capitalNumber +  get;
            //去掉刚刚获取的数据
            cash = cash / 10;

            if (cash == 0){
                break;
            }

        }

        //补零
        int count = 7 - get.length();

        for (int i = 0; i < count; i++) {
            get = cashTrans.getCapitalNumber(0) + get;
        }

        //定义数组表示单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};

        String finalget = "";
        for (int i = 0; i < get.length(); i++) {
            char c = get.charAt(i);
            //System.out.print(c);
            //打印单位
            //System.out.print(arr[i]);
            finalget = finalget + c + arr[i];
        }

        System.out.println(finalget);

    }
    //定义一个方法,把数字变成大写中文
    public String getCapitalNumber(int number){
        //定义一个索引向的数组,让数字和大写的中文产生对应关系
        //String getStr = (String) number;
        String[] index = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return index[number];
    }

}
