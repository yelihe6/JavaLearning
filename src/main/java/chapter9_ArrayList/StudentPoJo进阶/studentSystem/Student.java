package chapter9_ArrayList.StudentPoJo进阶.studentSystem;



//标准JavaBean结构   属性类
public class Student {

    private int id;
    private String name;
    private String QQ;
    private String School;

    public Student() {
    }

    public Student(int id, String name, String QQ, String school) {
        this.id = id;
        this.name = name;
        this.QQ = QQ;
        School = school;
    }


    public Student(String name, String QQ, String school) {
        this.name = name;
        this.QQ = QQ;
        School = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }
}
