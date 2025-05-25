package org.example.chapter22_methodCite.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class test1 {

    public static void main(String[] args) {
        List<String> message = new ArrayList<>();
        message.add("zhangjiajia, 19");
        message.add("jiangyujie, 18");
        message.add("wangqihan, 20");

        Student student1 = new Student("chenenqing",19);
        Student student2 = new Student("wujiaxiu",18);
        List<Student> girls = new ArrayList<>();
        girls.add(student1);
        girls.add(student2);

//        s -> new Student(s.split(",")[0], Integer.parseInt(s.split(", ")[1]))

        Student[] array = message.stream().map(Student::new).toArray(Student[]::new);

//        message.stream().toArray(String[]::new);
        String[] array1 = girls.stream().map(Student::getName).toArray(String[]::new);

        String[] array2 = girls.stream().map(Student::getString).toArray(String[]::new);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
}
