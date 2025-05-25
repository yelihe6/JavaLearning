package org.example.chapter10_OOP2.polymorphism.Test;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println("两只前腿死死的抱住"+food+"猛吃");
    }

    public void LookHouse(){
        System.out.println("狗会看家");
    }
}
