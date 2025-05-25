package chapter10_OOP2.Extend.Animals.dogs;

public class Poodle extends Dog{
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        String eatDrink = poodle.EatDrink();
        String lookingforhome = poodle.LookingForHome();
        String ceng = poodle.Ceng();
        System.out.println(
                "泰迪: "+eatDrink+","+lookingforhome+","+ceng
        );
    }

    public String Ceng(){
        return "蹭一蹭";
    }
}

