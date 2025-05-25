package Chapter25_IO.Demo4序列化流.object;

import java.io.Serial;
import java.io.Serializable;

//可序列化标记型接口
public class Student1 implements Serializable {
    @Serial
    private static final long serialVersionUID = -6676288083388626460L;

    //自定义serialVersionUID

    private String name;
    private Integer age;

    //transient 关键字 不会将其序列化到文件当中!!!
    private transient String idcode;

    public Student1() {
    }

    public Student1(String name, Integer age) {
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
