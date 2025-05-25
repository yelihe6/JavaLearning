package org.example.chapter23_Exception.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {

    public static void main(String[] args) throws ParseException {


        try {
            Student student = new Student();

            student.setAge(65);



        } catch (Exception e) {
            e.printStackTrace();
        }

        String date = "2006年12月19日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //编译时异常
        Date d = sdf.parse(date);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        String res = sdf1.format(d);


        System.out.println(res);

        System.err.println(res);

    }
}
