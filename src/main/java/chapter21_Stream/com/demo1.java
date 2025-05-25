package chapter21_Stream.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo1 {
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


        long count = Stream.concat(name1.stream(), name2.stream().distinct()).count();
        System.out.println(count);

        System.out.println("========================");

        Object[] array = name1.stream().toArray(s -> new String[s]);
        System.out.println(Arrays.toString(array));

        System.out.println("========================");

        List<String> collect = name2.stream().collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("========================");

        Set<String> collect1 = name2.stream().collect(Collectors.toSet());
        System.out.println(collect1);

        System.out.println("========================");

        Map<String, Integer> collect2 = name3.stream().distinct().collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));

        System.out.println(collect2);

    }
}
