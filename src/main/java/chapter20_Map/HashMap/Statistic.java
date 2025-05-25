package chapter20_Map.HashMap;

import java.util.*;

public class Statistic {
    public static void main(String[] args) {

        //定义四个地点
        String[] places = {"纽约", "东京", "新加坡", "台北"};

        //定义一个集合存放选择地点
        List<String> placeBox = new ArrayList<>();

        //遍历输出80人的选择
        for (int i = 1; i <= 80; i++) {
            Random r = new Random();
            int index = r.nextInt(4); //0-3
            placeBox.add(places[index]);
        }

        //统计
        Map<String, Integer> statistic = new HashMap<>();
        for (String box : placeBox) {
            if (statistic.containsKey(box)){
                Integer i = statistic.get(box);
                i++;
                statistic.put(box,i);
            }else {
                int start = 1;
                statistic.put(box, start);
            }
        }

        //统计数据
        System.out.println(statistic);

        //statistic.forEach((s, integer) -> System.out.println(s+"-"+integer));


        //最大值
        List<Integer> numbers = new ArrayList<>();
        Set<String> set = statistic.keySet();
        Iterator iterator = set.iterator();

        //while (iterator.hasNext()){
        //    System.out.println(iterator.next());
        //}

        set.forEach(s -> {
            numbers.add(statistic.get(s));
        });
        System.out.println(numbers);
        Integer max = numbers.get(0);;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= max) {
                max = numbers.get(i);
            }
        }
        System.out.println(max);
    }
}
