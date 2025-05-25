package chapter18_API_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practise1 {

    public static void main(String[] args) {
        List<Girl> girls = new ArrayList<>();
        Girl girl1 = new Girl();
        girl1.setName("xiabingqian");
        girl1.setAge(20);
        girl1.setHeight(161);

        Girl girl2 = new Girl();
        girl2.setName("zhangminghui");
        girl2.setAge(19);
        girl2.setHeight(159);

        Girl girl3 = new Girl();
        girl3.setName("huaxiuwei");
        girl3.setAge(20);
        girl3.setHeight(163);

        Girl girl4 = new Girl();
        girl4.setName("liujingjing");
        girl4.setAge(20);
        girl4.setHeight(163);

        girls.add(girl1);
        girls.add(girl2);
        girls.add(girl3);

        Girl[] objects = {girl1,girl2,girl3,girl4};

        Arrays.sort(objects, (o1, o2) -> {
                int temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().charAt(0) - o2.getName().charAt(0) : temp;
                return temp;
        });

        System.out.println(Arrays.toString(objects));

//        Arrays.sort(objects,((o1, o2) -> o1.getAge()-o2.getAge()));
//        Arrays.sort(objects,((o1, o2) -> o1.getHeight()-o2.getHeight()));

//        Integer[] integers = new Integer[girls.size()];
//        for (int i = 0; i < girls.size(); i++) {
//            integers[i] = girls.get(i).getAge();
//        }
//
//        String[] strings = new String[girls.size()];
//        for (int i = 0; i < girls.size(); i++) {
//            strings[i] = girls.get(i).getName();
//        }

//        Arrays.sort(integers,((o1, o2) -> o1 - o2));
//        Arrays.sort(strings,((o1, o2) -> o1.charAt(0) - o2.charAt(0)));
//
//        System.out.println(Arrays.toString(integers));
//        System.out.println(Arrays.toString(strings));
//        System.out.println(girl1.getName().charAt(0));
    }
}
