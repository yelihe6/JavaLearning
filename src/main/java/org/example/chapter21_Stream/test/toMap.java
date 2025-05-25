package org.example.chapter21_Stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class toMap {
    public static void main(String[] args) {

        List<String> message = new ArrayList<>();
        message.add("zhangjiajia, 19");
        message.add("jiangyujie, 18");
        message.add("wangqihan, 20");

        Map<String, Integer> collect = message.stream().filter(s -> Integer.parseInt(s.split(", ")[1]) > 18)
                .collect(Collectors.toMap(s -> s.split(", ")[0], s -> Integer.parseInt(s.split(", ")[1])));
        System.out.println(collect);
    }
}
