package chapter10_OOP2.polymorphism.Person;

public class Person {
    private String name;
    private String area;

    public Person() {
    }

    public Person(String name, String area) {
        this.name = name;
        this.area = area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void show(){
        System.out.println(name+area);
    }

}
