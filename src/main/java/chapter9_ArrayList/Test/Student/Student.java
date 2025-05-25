package chapter9_ArrayList.Test.Student;



public class Student {
    //私有化成员变量
    private String name;
    private String age;

    //空参构造方法
    public Student() {
    }

    //带全部参数构造方法
    public Student(String name, String age) {
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
