package chapter9_ArrayList.Test.Student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Test3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("你想创建几个学生对象?");
        int count = scanner.nextInt();

        //创建集合
        ArrayList<Student> stu = new ArrayList();

        for (int i = 0; i < count; i++) {
            System.out.println("第"+(i+1)+"个学生的id,姓名和qq,学校");
//            System.out.println("id:");
//            int id = scanner.nextInt();
//            System.out.println("姓名:");
//            String name = scanner.next();
//            System.out.println("qq:");
//            String qq = scanner.next();
//            System.out.println("学校:");
//            String school = scanner.next();
//            Student student = new Student(id,name,qq,school);
            //添加元素
//            stu.add(student);
        }
        //创建学生对象
//        Student student1 = new Student("张嘉佳","18");
//        Student student2 = new Student("刘晶晶","19");
//        Student student3 = new Student("翁彩霞","18");

        //遍历集合
//        for (int i = 0; i < stu.size(); i++) {
//            if (i == 0){
//                System.out.print("["+"("+stu.get(i).getName()+":"+stu.get(i).getAge()+")");
//            } else if (i > 0 && i < stu.size()-1) {
//                System.out.print(", "+"("+stu.get(i).getName()+":"+stu.get(i).getAge()+")");
//            }else {
//                System.out.print(", "+"("+stu.get(i).getName()+":"+stu.get(i).getAge()+")"+"]");
//            }
//        }

        //foreach循环
        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
        for (Student student: stu) {
            stringJoiner.add("("+student.getName()+":"+student.getAge()+")");
        }
        String stuRs = stringJoiner.toString();
        System.out.println(stuRs);




    }
}
