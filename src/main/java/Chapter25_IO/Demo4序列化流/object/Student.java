package Chapter25_IO.Demo4序列化流.object;

import java.io.Serial;
import java.io.Serializable;

//可序列化标记型接口
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 2483431922167118459L;
    private String name;
    private Integer age;


    public Student() {
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
        this.age = age;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + "}";
    }
}
