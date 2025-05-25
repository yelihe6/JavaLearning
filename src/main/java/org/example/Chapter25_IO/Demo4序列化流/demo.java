package org.example.Chapter25_IO.Demo4序列化流;

import Chapter25_IO.Demo4序列化流.object.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        //序列化
//        Student student = new Student("应鑫榆", 17);
//        Student student1 = new Student("张温绮", 19);
//        Student student2 = new Student("戴冰洁", 20);
//
//        FileOutputStream fos = new FileOutputStream("src\\chapter25_IO\\girlsOBJ.txt");
//
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student);
//
//        oos.writeObject(students);
////        oos.writeObject(student1);
////        oos.writeObject(student2);

//        oos.close();

        FileInputStream fis = new FileInputStream("src\\chapter25_IO\\girlsOBJ.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

//        Student student;
//
//        while ((student = (Student) ois.readObject()) != null) {
////            Student student = (Student) ois.readObject();
////        Student student1 = (Student) ois.readObject();
////        Student student2 = (Student) ois.readObject();
//
//            System.out.println(student);
////        System.out.println(student1);
////        System.out.println(student2);
//        }
        List<Student> stu = (ArrayList<Student>) ois.readObject();

        for (Student student : stu) {
            System.out.println(student);
        }

        ois.close();
    }
}
