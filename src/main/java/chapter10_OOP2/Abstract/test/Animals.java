package chapter10_OOP2.Abstract.test;

public abstract class Animals {
    private String type;
    private String age;

    public Animals() {
    }

    public Animals(String type, String age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public abstract void Action();
}
