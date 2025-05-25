package org.example.Chapter25_IO.权重随机算法;



public class Student {
    private String name;
    private String gender;
    private Integer age;
    private Double weight;


    public Student() {
    }

    public Student(String name, String gender, Integer age, Double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "-" + gender + "-" + age + "-" + weight;
    }
}
