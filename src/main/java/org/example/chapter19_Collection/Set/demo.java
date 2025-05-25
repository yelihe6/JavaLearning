package org.example.chapter19_Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class demo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("何若欣");
        set.add("何若欣");
        set.add("夏冰倩");
        set.add("阮怡");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s: set) {
            System.out.println(s);
        }

        set.forEach( s -> System.out.println(s));
    }
}
