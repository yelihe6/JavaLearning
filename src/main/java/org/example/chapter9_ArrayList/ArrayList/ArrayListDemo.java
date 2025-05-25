package org.example.chapter9_ArrayList.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        泛型  :   限定集合中存储数据的 <类型>
//        不能直接存储基本数据类型
        ArrayList<String> arrayList = new ArrayList<>();

        //添加
        boolean a = arrayList.add("张嘉佳");
        System.out.println(a);
        System.out.println(arrayList);
        boolean b = arrayList.add("张温绮");
        System.out.println(b);
        System.out.println(arrayList);

        arrayList.add("张铭慧");
        System.out.println(arrayList);

        //删除
        arrayList.remove(0);
        System.out.println(arrayList);
//        arrayList.remove("张嘉佳");

//        修改
        String qian = arrayList.set(1,"方倩汝");
        System.out.println(qian);
        System.out.println(arrayList);

        //查询
        String WenQi = arrayList.get(0);
        System.out.println(WenQi);

//        int size = arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
