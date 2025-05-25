package org.example.chapter23_Exception.Demo;

public class Student {
    private String name;
    private Integer age;


    public Student() {
    }

    public Student(String s) {
        String name = s.split(", ")[0];
        Integer age = Integer.parseInt(s.split(", ")[1]);
        this.name = name;
        this.age = age;
    }

    public static String getString(Student student) {
        return student.getName() + "-" +student.getAge();
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        if (age >= 40 || age <= 15) {
            throw new RuntimeException();
        }else {
            this.age = age;
        }

    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
