package chapter10_OOP2.Abstract.test;

public class Frog extends Animals{
    @Override
    public void Action() {
        System.out.println("吃虫子,喝水");
    }

    public Frog() {
    }

    public Frog(String type, String age) {
        super(type, age);
    }
}
