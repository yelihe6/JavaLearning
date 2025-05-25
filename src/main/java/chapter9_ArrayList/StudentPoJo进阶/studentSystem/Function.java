package chapter9_ArrayList.StudentPoJo进阶.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Function {

//    public ArrayList<Student> students;
    public Student student;

//    添加方法
    public void add(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("你想创建几个学生对象?");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("第"+(i+1)+"个学生的id,姓名和年龄");
            System.out.println("id:");
            int id = scanner.nextInt();
            System.out.println("姓名:");
            String name = scanner.next();
            System.out.println("qq:");
            String qq = scanner.next();
            System.out.println("学校:");
            String school = scanner.next();
            student = new Student(id,name,qq,school);
            //添加元素
            if (students.size() == 0){
                students.add(student);
            }else {
                for (Student student:students) {
                    if (student.getId() == id){
                        System.out.println("id不可重复!");
                        i--;
                    }
                }
            }

        }
        System.out.println("添加成功!");
        //foreach循环
        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
        for (Student student: students) {
            stringJoiner.add("("+student.getId()+":"+student.getName()+","+student.getQQ()+","+student.getSchool()+")");
        }
        String stuRs = stringJoiner.toString();
        System.out.println(stuRs);
    }

    //删除方法
    public boolean delete(int id,ArrayList<Student> students){
        for (Student stu: students) {
            if (stu.getId() == id){
                students.remove(stu);
                System.out.println("删除成功!");
                return true;
            }
        }
        System.out.println("没有这个id,删除失败!");
        return false;
    }
    //修改方法
    public boolean modify(int id,ArrayList<Student> students){
//        for (Student stu: students) {
//            if (stu.getId() == id){
//                students.set();
//                System.out.println("修改成功!");
//                return true;
//            }
//        }
//        return false;
        for (Student student:students) {
            if (!(student.getId() == id)){
                System.out.println("该id不存在!");
                return false;
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("你想修改的姓名:");
        String name = scanner.next();
        System.out.println("你想修改的qq:");
        String qq = scanner.next();
        System.out.println("你想修改的学校:");
        String school = scanner.next();
        Student student = new Student(id,name,qq,school);
        students.set(id-1,student);
        System.out.println("修改成功!");
        return true;

    }


    //查询方法
    public void geti(ArrayList<Student> students){
        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
        if (students.size() == 0){
            System.out.println("当前无学生信息,请添加后查询");
        }else{
            System.out.println("id   name   qq     school");
            for (Student student: students) {
                System.out.println(student.getId()+"    "+student.getName()+"    "+student.getQQ()+"    "+student.getSchool());
            }
        }
    }




}
