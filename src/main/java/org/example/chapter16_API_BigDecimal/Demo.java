package org.example.chapter16_API_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {

    //精确运算


    public static void main(String[] args) {
        //通过传递字符串表示的小数来创建对象
        BigDecimal bd1 = new BigDecimal("0.03");
        BigDecimal bd2 = new BigDecimal("0.07");
        //相加
        BigDecimal bd3= bd1.add(bd2);
        BigDecimal bd4= bd2.add(bd1);
//        System.out.println(bd3);
//        System.out.println(bd4);


        BigDecimal bd5 = BigDecimal.valueOf(10.0);
        BigDecimal bd6 = BigDecimal.valueOf(2.0);

        BigDecimal bd7 = bd5.add(bd6);
        BigDecimal bd8 = bd5.subtract(bd6);
        BigDecimal bd9 = bd5.multiply(bd6);


        BigDecimal bd10 = BigDecimal.valueOf(10.0);
        BigDecimal bd11 = BigDecimal.valueOf(3.0);
//        System.out.println(bd7);
//        System.out.println(bd8);
//        System.out.println(bd9);

        BigDecimal bd12 = bd10.divide(bd11,2, RoundingMode.UP);
        System.out.println(bd12);


        BigDecimal bd13 = BigDecimal.valueOf(0.298);
//        double k = (double) BigDecimal.valueOf(0.298);



    }





}
