package chapter10_OOP2.Interface.Demo;

public abstract class Students {
    private String name;
    private String gender;
    private String age;
    private String diploma;

    public Students() {
    }

    public Students(String name, String gender, String age, String diploma) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.diploma = diploma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public abstract void review();
}
