package org.example.chapter19_Collection.TreeSet.Test;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class test {


    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>((o1,o2) -> {
                int sumO1 = o1.getChinese()+o1.getMath()+o1.getEnglish();
                int sumO2 = o2.getChinese()+o2.getMath()+o2.getEnglish();
                System.out.println(sumO1);
                System.out.println(sumO2);
                int item = sumO1 == sumO2 ?  o1.getChinese() - o2.getChinese() : sumO1-sumO2;
                item = item == 0 ? o1.getMath() - o2.getMath() : item;
                item = item == 0 ? o1.getEnglish() - o2.getEnglish() : item;
                item = item == 0 ? o1.getAge() - o2.getAge() : item;
                item = item == 0 ? o1.getName().charAt(0) - o2.getName().charAt(0) : item;
                return item;
        });

        Student student1 = new Student("夏晓敏", 17,120,114,110);
        Student student2 = new Student("涂家淇", 17,120,113,142);

        students.add(student1);
        students.add(student2);

//        System.out.println(students);
        for (Student student : students) {
            System.out.println(student+",总分: "+(student.getChinese()+student.getEnglish()+student.getMath()));
        }

    }
}
