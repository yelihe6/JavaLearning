package chapter10_OOP2.Extend.Animals.cats;

public class Ragdoll extends Cat{
    public static void main(String[] args) {
        Ragdoll ragdoll  = new Ragdoll();
        String eatDrink = ragdoll.EatDrink();
        String catchMouse = ragdoll.CatchMouse();
        System.out.println(
                "布偶猫: "+eatDrink+","+catchMouse
        );
    }
}
