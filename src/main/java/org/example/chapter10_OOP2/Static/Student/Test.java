package org.example.chapter10_OOP2.Static.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<StuAttr> students = new ArrayList<>();
        StuAttr stuAttr1 = new StuAttr("郑洁",18,"女");
        StuAttr stuAttr2 = new StuAttr("应鑫榆",16,"女");
        StuAttr stuAttr3 = new StuAttr("叶盈盈",19,"女");
        StuAttr stuAttr4 = new StuAttr("邓欣",20,"女");
        StuAttr stuAttr5= new StuAttr("代娇娇",15,"女");

        students.add(stuAttr1);
        students.add(stuAttr2);
        students.add(stuAttr3);
        students.add(stuAttr4);
        students.add(stuAttr5);


        int Min = MaxTool.MinAgeTool(students);
        System.out.println("最小值是:"+Min);
        int Max = MaxTool.MaxAgeTool(students);
        System.out.println("最大值是:"+Max);

    }
}
