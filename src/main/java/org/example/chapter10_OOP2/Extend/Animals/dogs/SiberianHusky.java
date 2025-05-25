package org.example.chapter10_OOP2.Extend.Animals.dogs;

public class SiberianHusky extends Dog{
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky();
        String eatDrink = siberianHusky.EatDrink();
        String lookingforhome = siberianHusky.LookingForHome();
        String chaijia = siberianHusky.ChaiJia();
        System.out.println(
                "哈士奇: "+eatDrink+","+lookingforhome+","+chaijia
        );
    }


    public String ChaiJia(){
        return "拆家";
    }
}
