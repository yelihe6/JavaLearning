package org.example.chapter14_API_Object.clone;

//没有任何抽象方法
//标记性接口
//可克隆的
public class User implements Cloneable{
    private String name;
    private String age;

    private int[] data;

    public User() {
    }

    public User(String name, String age, int[] data) {
        this.name = name;
        this.age = age;
        this.data = data;
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


    @Override
    public String toString() {
        return "[" + name + " : " + age + "]";
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] data = this.data;

        int[] newData = new int[data.length];

        System.arraycopy(data,0,newData,0,data.length);

        User user = (User) super.clone();

        user.data = newData;

        return user;
    }
}
