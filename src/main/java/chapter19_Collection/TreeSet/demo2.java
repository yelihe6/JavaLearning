package chapter19_Collection.TreeSet;

import java.util.TreeSet;

public class demo2 {

    public static void main(String[] args) {

        Student student1 = new Student("张雨欣",18);
        Student student2 = new Student("叶盈盈", 20);
        Student student3 = new Student("刘晶晶",19);

        TreeSet<Student> students = new TreeSet<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

    }
}
