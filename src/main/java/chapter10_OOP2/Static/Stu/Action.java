package chapter10_OOP2.Static.Stu;

import java.util.ArrayList;

public class Action {

    public static void main(String[] args) {
        ArrayList<StudentDemo> studentDemos = new ArrayList<>();
        StudentDemo studentDemo1 = new StudentDemo("张嘉佳",18,"女");
        StudentDemo studentDemo2 = new StudentDemo("郑洁",19,"女");
        //利用类名调用
        StudentDemo.teacherName1 = "文科老师";
        StudentDemo.teacherName2 = "理科老师";
        Learning2(studentDemo1);
        Learning1(studentDemo2);
    }

    private static void Learning2(StudentDemo studentDemo2) {
        System.out.println(studentDemo2.getName()+", "+ studentDemo2.getAge()+"岁, "+studentDemo2.getGender()+", 正在学习, 是"+StudentDemo.teacherName2);
    }

    private static void Learning1(StudentDemo studentDemo1) {
        System.out.println(studentDemo1.getName()+", "+ studentDemo1.getAge()+"岁, "+studentDemo1.getGender()+", 正在学习, 是"+StudentDemo.teacherName1);
    }


}
