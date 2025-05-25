package chapter10_OOP2.polymorphism.Person;

public class Girls extends Person{

    @Override
    public void show() {
        System.out.println("女孩的信息为: "+getName()+","+getArea());
    }


}
