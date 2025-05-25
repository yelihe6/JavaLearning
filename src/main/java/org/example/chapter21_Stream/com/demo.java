package org.example.chapter21_Stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class demo {


    public static void main(String[] args) {
        List<String> name1 = new ArrayList<>();
        name1.add("张温绮");
        name1.add("范雯欣");
        name1.add("张温涵");
        name1.add("张嘉佳");
        name1.add("姜钧怡");

        List<String> name2 = new ArrayList<>();
        name2.add("林捷臻");
        name2.add("施晶晶");
        name2.add("施晶晶");
        name2.add("张雪仪");
        name2.add("杨佳灿");

        List<String> name3 = new ArrayList<>();
        name3.add("张温绮-110");
        name3.add("范雯欣-135");
        name3.add("张温涵-95");
        name3.add("张嘉佳-140");
        name3.add("姜钧怡-125");

//        Stream<String> zhang = name.stream().filter(n -> n.startsWith("张"));
//
//        zhang.forEach(s -> System.out.println(s));
        name1.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        name1.stream().limit(4).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        name1.stream().skip(3).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        name2.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("=======================");

        Stream.concat(name1.stream(),name2.stream().distinct()).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        name3.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));


    }
}
