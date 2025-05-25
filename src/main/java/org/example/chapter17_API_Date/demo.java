package org.example.chapter17_API_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {


    public static void main(String[] args) throws ParseException {

//        Date date = new Date();
//
//        System.out.println(date);


    String str = "2004-12-26";
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    Date date = sdf1.parse(str);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 E");
    String res = sdf2.format(date);
    System.out.println(res);




    }
}
