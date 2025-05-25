package chapter10_OOP2.Static.Student;

import java.util.ArrayList;

public class MaxTool {

    private MaxTool(){
    }

    public static int MinAgeTool(ArrayList<StuAttr> stuAttrs){
//        int temp;
        int temp = stuAttrs.get(0).getAge();
        for (int i = 0; i < stuAttrs.size()-1; i++) {
            if (temp > stuAttrs.get(i + 1).getAge()) {
                temp = stuAttrs.get(i + 1).getAge();
            }
//            System.out.println(stuAttrs.get(i).getAge());
        }
        return temp;
    }


    public static int MaxAgeTool(ArrayList<StuAttr> stuAttrs) {
        int temp = stuAttrs.get(0).getAge();
        for (int i = 0; i < stuAttrs.size()-1; i++) {
            if (temp < stuAttrs.get(i + 1).getAge()) {
                temp = stuAttrs.get(i + 1).getAge();
            }
//            System.out.println(stuAttrs.get(i).getAge());
        }
        return temp;
    }
}
