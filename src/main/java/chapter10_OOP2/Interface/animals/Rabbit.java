package chapter10_OOP2.Interface.animals;

public class Rabbit extends Animals{
    @Override
    public void eat(String something) {
        System.out.println("兔子吃:"+something);
    }

    public Rabbit() {
    }

    public Rabbit(String name, String age) {
        super(name, age);
    }
}
