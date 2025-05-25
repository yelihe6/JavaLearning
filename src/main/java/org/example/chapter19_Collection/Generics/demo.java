package org.example.chapter19_Collection.Generics;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addAllUtil.AddObj(list, "zhangyuxin", "linyingying", "zhangwenqi");
        System.out.println(list);
    }
}
