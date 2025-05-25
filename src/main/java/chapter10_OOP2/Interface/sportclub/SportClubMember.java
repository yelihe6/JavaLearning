package chapter10_OOP2.Interface.sportclub;

public abstract class SportClubMember {
    private String name;
    private String age;

    public SportClubMember() {
    }

    public SportClubMember(String name, String age) {
        this.name = name;
        this.age = age;
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

    public abstract String Type(String position);

}
