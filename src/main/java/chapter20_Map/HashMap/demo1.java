package chapter20_Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class demo1 {

    public static void main(String[] args) {

        Map<Student,Integer> StuMap = new HashMap<>();
        Student student1 = new Student("刘羽欣",18);
        //去重
        Student student2 = new Student("肖欣哲",19);
        Student student3 = new Student("肖欣哲",19);

        Student student4 = new Student("叶娉亦",20);

        StuMap.put(student1,125);
        StuMap.put(student2,127);
        StuMap.put(student3,135);
        StuMap.put(student4,147);

        Set<Map.Entry<Student, Integer>> entries = StuMap.entrySet();
        for (Map.Entry<Student, Integer> entry : entries) {
            System.out.println(entry.getKey() +": "+entry.getValue());
        }

        StuMap.forEach((s,i) -> System.out.println(s+": "+i));

//        StuMap.forEach(new BiConsumer<Student, Integer>() {
//            @Override
//            public void accept(Student student, Integer integer) {
//
//            }
//        });


    }
}
