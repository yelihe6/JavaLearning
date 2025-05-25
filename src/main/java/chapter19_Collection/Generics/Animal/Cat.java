package chapter19_Collection.Generics.Animal;

public class Cat extends Animal{
    private String name;
    private Integer age;


    public Cat() {
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public String eat() {
        return "一只叫做"+name+"的, "+age+"岁的猫 , 正在吃东西";
    }
}
