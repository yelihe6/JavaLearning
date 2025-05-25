package chapter10_OOP2.Abstract.test;

public class Dog extends Animals{
    @Override
    public void Action() {
        System.out.println("吃骨头,喝水");
    }

    public Dog() {
    }

    public Dog(String type, String age) {
        super(type, age);
    }
}
