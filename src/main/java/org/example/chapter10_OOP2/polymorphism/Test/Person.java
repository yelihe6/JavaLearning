package org.example.chapter10_OOP2.polymorphism.Test;

public class Person {
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
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


    public void keepPet(Animal animal,String food){
        if (animal instanceof Dog d){
            System.out.println(
                    "年龄为"+getAge()+"的"+getName()+"养了一只"
                            +animal.getColor()+"的"+animal.getAge()+ "的狗,"
                            +animal.getAge()+"的"+animal.getColor()+"的狗"
            );
            animal.eat(food);
            d.LookHouse();
        } else if (animal instanceof Cat c) {
            System.out.println(
                    "年龄为"+getAge()+"的"+getName()+"养了一只"
                            +animal.getColor()+"的"+animal.getAge()+ "的猫,"
                            +animal.getAge()+"的"+animal.getColor()+"的猫"
            );
            animal.eat(food);
            c.CatchMouse();
        }

    }

}
