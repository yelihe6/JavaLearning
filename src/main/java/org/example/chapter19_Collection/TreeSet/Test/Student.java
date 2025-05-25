package org.example.chapter19_Collection.TreeSet.Test;


public class Student {

    private String name;
    private Integer age;

    private Integer Chinese;

    private Integer Math;
    private Integer English;


    public Student() {
    }

    public Student(String name, Integer age, Integer Chinese, Integer Math, Integer English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
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
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public Integer getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(Integer Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return Math
     */
    public Integer getMath() {
        return Math;
    }

    /**
     * 设置
     * @param Math
     */
    public void setMath(Integer Math) {
        this.Math = Math;
    }

    /**
     * 获取
     * @return English
     */
    public Integer getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(Integer English) {
        this.English = English;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", Math = " + Math + ", English = " + English + "}";
    }
}
