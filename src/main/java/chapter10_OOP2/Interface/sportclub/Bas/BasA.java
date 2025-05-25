package chapter10_OOP2.Interface.sportclub.Bas;

public class BasA extends BasketBall{
    public BasA() {
    }

    public BasA(String name, String age) {
        super(name, age);
    }

    public String Type(String position) {
        return super.Type(position);
    }
}
