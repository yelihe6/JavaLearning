package org.example.chapter20_Map.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Statistic {
    public static void main(String[] args) {

        String str = "zhangyuxinfanwenxinzhangjiajiazhangwenqigaoruichengxiaxiaomin";

        Map<Character, Integer> count = new TreeMap<>();



        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println(c);
            if (count.containsKey(c)){
                Integer i1 = count.get(c);
                i1++;
                count.put(c, i1);
            } else {
                count.put(c,1);
            }
        }

//        Map<Character,Integer> Count = new TreeMap<>(new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                return count.get(o1) - count.get(o2);
//            }
//        });
//
//        count.forEach(new BiConsumer<Character, Integer>() {
//            @Override
//            public void accept(Character character, Integer integer) {
//                Count.put(character, integer);
//            }
//        });


        StringBuilder sb = new StringBuilder();

        count.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(")"));
//        Count.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(")"));

        String string = sb.toString();
        System.out.println(string);


    }
}
