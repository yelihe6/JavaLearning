package org.example.chapter21_Stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dataOperation {

    public static void main(String[] args) {

        List<String> boys = new ArrayList<>();
        boys.add("姜言润, 19");
        boys.add("戴慧健, 18");
        boys.add("王坚毅, 19");
        boys.add("邱驰迪, 20");
        boys.add("张铭浩, 19");
        boys.add("朱恩宇, 19");

        List<String> girls = new ArrayList<>();
        girls.add("方倩汝, 19");
        girls.add("李冰洁, 18");
        girls.add("方诗雅, 18");
        girls.add("王菲怡, 19");
        girls.add("张雪仪, 18");
        girls.add("赖珏妤, 20");

        Stream<String> boy = boys.stream().distinct().filter(s -> s.split(", ")[0].length() == 3).limit(2);

        //姓方的
        Stream<String> girl = girls.stream().distinct().filter(s -> s.startsWith("方")).skip(1);

        List<Actor> collect = Stream.concat(boy, girl).map(s -> new Actor(s.split(", ")[0], Integer.parseInt(s.split(", ")[1]))).collect(Collectors.toList());

        System.out.println(collect);


    }
}
