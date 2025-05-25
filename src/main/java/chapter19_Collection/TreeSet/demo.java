package chapter19_Collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class demo {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(114514);
        ts.add(1919810);
        ts.add(141487);
        ts.add(65536);
        ts.add(299784652);

        System.out.println(ts);

        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer t : ts) {
            System.out.println(t);
        }

        ts.forEach(s -> System.out.println(s));
//        ts.forEach(System.out::println);
    }
}
