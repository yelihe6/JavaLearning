package org.example.chapter19_Collection.Generics;

import java.util.List;

public class addAllUtil {
    private addAllUtil(){}

    public static <E> void AddObj (List<E> list, E... e){
        for (E ele : e) {
            list.add(ele);
        }
    }
}
