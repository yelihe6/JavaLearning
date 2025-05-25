package org.example.chapter10_OOP2.Interface.sportclub.Bas;

public class BasC extends BasketBall{

    public BasC() {
    }

    public BasC(String name, String age) {
        super(name, age);
    }

    @Override
    public String Type(String position) {
        return super.Type(position);
    }
}
