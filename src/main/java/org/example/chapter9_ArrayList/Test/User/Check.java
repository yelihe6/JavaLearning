package org.example.chapter9_ArrayList.Test.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Check {

    public boolean Find(String name,ArrayList<User> user){
        for (User u: user) {
           if (name.equals(u.getUsername())){
               System.out.println("id: "+u.getId());
               return true;
           }
        }
        System.out.println(-1);
        return false;
    }

    public void geti(ArrayList<User> students){
        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
        for (User student: students) {
            stringJoiner.add(student.getId());
        }
        System.out.println(stringJoiner);

    }

    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        Check check = new Check();
        Scanner sc = new Scanner(System.in);
        //创建类对象
        User u1 = new User("1","张雨欣","123456");
        User u2 = new User("2","张雪仪","123457");
        User u3 = new User("3","肖欣哲","123458");
        User u4 = new User("4","陈文文","123459");

        //加入集合
        user.add(u1);
        user.add(u2);
        user.add(u3);
        user.add(u4);

//        System.out.println("请输入你想查询的姓名:");
//        String nameIn = sc.next();
//        System.out.println(check.Find(nameIn,user));
        check.geti(user);

    }
}
