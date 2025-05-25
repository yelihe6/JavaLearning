package org.example.chapter10_OOP2.codeblock;

public class Student {
    private String name;
    private String age;

    //构造代码块:
    //1.写在成员位置
    //2.将构造方法中重复的代码抽取出来
    //3.创建类对象之后先执行构造代码块当中的代码再执行构造方法
    static {
        System.out.println("武美梦你好");
    }


    public Student() {
        System.out.println("123456");
    }

    public Student(String name, String age) {
        System.out.println("1314520");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
