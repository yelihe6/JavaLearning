package org.example.chapter22_methodCite.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class demo1 {

    public static void main(String[] args) {

        Integer[] integers = {33, 44, 77, 101, 41, 37, 5};

        Arrays.sort(integers,demo1::get);

        System.out.println(Arrays.toString(integers));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(111);
        integerList.add(999);
        integerList.add(888);

        integerList.forEach(System.out::println);

    }

    public static Integer get(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
