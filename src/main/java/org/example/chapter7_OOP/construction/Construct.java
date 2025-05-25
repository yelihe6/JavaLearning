package org.example.chapter7_OOP.construction;



// 功能类的封装
public class Construct {

    private int age;
    private String gender;

    public Construct(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }



    //无参构造
    public Construct(){
        System.out.println("张铭慧很可爱");
    }
//
//    //有参构造
//    public Construct(int age, String gender){
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public String getGender(){
//        return gender;
//    }

}
