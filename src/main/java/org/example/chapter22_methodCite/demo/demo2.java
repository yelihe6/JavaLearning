package org.example.chapter22_methodCite.demo;

import java.util.ArrayList;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= 50 ; i++) {
            strings.add(String.valueOf(i));
        }
        System.out.println(strings);

        List<Integer> collect = strings.stream().map(Integer::parseInt).toList();
        System.out.println(collect);

    }
}
