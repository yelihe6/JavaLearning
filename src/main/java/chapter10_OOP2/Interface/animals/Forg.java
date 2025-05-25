package chapter10_OOP2.Interface.animals;

public class Forg extends Animals implements Actions{

    @Override
    public void eat(String something) {
        System.out.println("青蛙吃:"+something);
    }

    public Forg() {
    }

    public Forg(String name, String age) {
        super(name, age);
    }

    @Override
    public void Swiming() {
        System.out.println("蛙泳");
    }
}
