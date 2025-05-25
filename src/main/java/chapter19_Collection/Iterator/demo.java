package chapter19_Collection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {

    public static void main(String[] args) {


        Collection<String> coll = new ArrayList<>();
        coll.add("张雨欣");
        coll.add("刘羽欣");
        coll.add("王子乐");

        // 迭代器对象 ...
        // 指针一次性 , 不可复位
        try {
            Iterator iterator = coll.iterator();

            // 指针自动指向
            while (iterator.hasNext()) {
                System.out.println(iterator.next());

                Thread.sleep(1000);

            }

//            System.out.println(iterator.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
