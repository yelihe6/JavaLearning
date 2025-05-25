package chapter10_OOP2.Extend.Student;

import java.util.StringJoiner;

public class Girls extends StudentAtrr{

    public static void main(String[] args) {
        Girls girls = new Girls();
        girls.Execute();
    }

    public void Execute(){
        StringJoiner S1 = new StringJoiner(",","[","]");
        StringJoiner S2 = new StringJoiner(",","[","]");
        StringJoiner S3 = new StringJoiner(",","[","]");
        StringJoiner S4 = new StringJoiner(",","[","]");
        Student student1 = new Student("张铭慧","女",18);
        Student student2 = new Student("郑洁","女",18);
        Student student3 = new Student("张嘉佳","女",18);
        Student student4 = new Student("姜雨欣","女",19);


        S1.add(student3.getName());
        S1.add(student3.getGender());
        S1.add(student3.getAge()+"岁");
        S1.add(Phone());
        S1.add(Subject());
        S1.add(super.Diploma());
        System.out.println(S1);

        S2.add(student2.getName());
        S2.add(student2.getGender());
        S2.add(student2.getAge()+"岁");
        S2.add(super.Phone());
        S2.add(Subject());
        S2.add(super.Diploma());
        System.out.println(S2);

        S3.add(student1.getName());
        S3.add(student1.getGender());
        S3.add(student1.getAge()+"岁");
        S3.add(super.Phone());
        S3.add(super.Subject());
        S3.add(super.Diploma());
        System.out.println(S3);

        S4.add(student4.getName());
        S4.add(student4.getGender());
        S4.add(student4.getAge()+"岁");
        S4.add(super.Phone());
        S4.add(super.Subject());
        S4.add(Diploma());
        System.out.println(S4);


    }


    @Override
    public String Phone(){
        return "安卓手机";
    }
    @Override
    public String Subject(){
        return "不用学数学";
    }
    @Override
    public String Diploma(){
        return "专科";
    }


}
