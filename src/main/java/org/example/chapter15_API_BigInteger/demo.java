package org.example.chapter15_API_BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class demo {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(Math.pow(2,32));
        BigInteger bigInteger = new BigInteger(32, r);
        System.out.println(bigInteger);

        BigInteger bigInteger1 = new BigInteger("99999999999999999999999");
        System.out.println(bigInteger1);

        //转换成16进制
        //1.数字必须是整数
        //2.字符串中的数字必须和进制吻合

        BigInteger bigInteger2 = new BigInteger("10086",16);
        System.out.println(bigInteger2);
    }
}
