package chapter19_Collection.Foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class demo {
    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();
        collection.add("夏冰倩");
        collection.add("方伊茹");
        collection.add("阮怡");

        collection.forEach(System.out::println);
    }
}
