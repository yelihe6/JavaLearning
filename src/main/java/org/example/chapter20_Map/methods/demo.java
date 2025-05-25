package org.example.chapter20_Map.methods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class demo {
    public static void main(String[] args) {

        //创建对象
        Map<String,Integer> score = new HashMap<>();
        //添加
        score.put("zhangjiajia", 120);
        score.put("zhangwenqi", 115);
        score.put("zhangminghui", 130);
        //取值  没有则null
        //System.out.println(score.get("zhangminghui"));

        //遍历 lambda
        score.forEach((s,integer) -> System.out.println(s +": "+integer));

        //键 -> 值
        Set<String> set = score.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s+": "+score.get(s));
        }

//        for (String s : set) {
//            System.out.println(s+": "+score.get(s));
//        }
//
//        set.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s+": "+score.get(s));
//            }
//        });

        //键值对
        Set<Map.Entry<String, Integer>> entries = score.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
