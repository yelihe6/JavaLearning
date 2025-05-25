package org.example.chapter10_OOP2.Extend.Test0;

public class Profession {
    private String id;
    private String name;
    private String salary;

    public String Work(String work){
        return work;
    }

    public String Eat(String eat){
        return eat;
    }

    public Profession() {
    }

    public Profession(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
