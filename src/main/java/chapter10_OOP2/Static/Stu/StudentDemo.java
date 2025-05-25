package chapter10_OOP2.Static.Stu;

public class StudentDemo {

    private String name;

    private int age;

    private String gender;

    public static String teacherName1;

    public static String teacherName2;

    public StudentDemo() {
    }

    public StudentDemo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
