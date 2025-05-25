package chapter10_OOP2.Extend.Animals;

import chapter10_OOP2.Extend.Animals.cats.DragonLi;
import chapter10_OOP2.Extend.Animals.cats.Ragdoll;
import chapter10_OOP2.Extend.Animals.dogs.Poodle;
import chapter10_OOP2.Extend.Animals.dogs.SiberianHusky;

public class Test {
    public static void main(String[] args) {
        DragonLi dragonLi = new DragonLi();
        String eatDrink = dragonLi.EatDrink();
        String catchMouse = dragonLi.CatchMouse();
        System.out.println(
                "中国狸花猫: "+eatDrink+","+catchMouse
        );

        Ragdoll ragdoll  = new Ragdoll();
        String eatDrink1 = ragdoll.EatDrink();
        String catchMouse1 = ragdoll.CatchMouse();
        System.out.println(
                "布偶猫: "+eatDrink1+","+catchMouse1
        );

        Poodle poodle = new Poodle();
        String eatDrink2 = poodle.EatDrink();
        String lookingforhome = poodle.LookingForHome();
        String ceng = poodle.Ceng();
        System.out.println(
                "泰迪: "+eatDrink2+","+lookingforhome+","+ceng
        );

        SiberianHusky siberianHusky = new SiberianHusky();
        String eatDrink3 = siberianHusky.EatDrink();
        String lookingforhome2 = siberianHusky.LookingForHome();
        String chaijia = siberianHusky.ChaiJia();
        System.out.println(
                "哈士奇: "+eatDrink3+","+lookingforhome2+","+chaijia
        );
    }
}
