package org.example.chapter10_OOP2.polymorphism.Test;

public class Cat extends Animal{


    public Cat() {
    }

    public Cat(String age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println("猫咪眨着眼侧着头吃"+food);
    }




    public void CatchMouse(){
        System.out.println("猫会抓老鼠");
    }
}
