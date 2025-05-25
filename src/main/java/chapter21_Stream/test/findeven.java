package chapter21_Stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class findeven {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1215);
        integers.add(4548);
        integers.add(7733);
        integers.add(6669);
        for (int i = 1; i <= 10 ; i++) {
            integers.add(i);
        }

        List<Integer> collect = integers.stream().distinct().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}
