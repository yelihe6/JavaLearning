package org.example.chapter8_String.joiner;

import java.util.StringJoiner;

public class Joiner {

    public static void main(String[] args) {
                                            //间隔符号  //开始符号  //结束符号
        StringJoiner sj = new StringJoiner(",","[","]");
        String get = sj.add("张").add("温").add("绮").toString();
        System.out.println(get);



    }



}
