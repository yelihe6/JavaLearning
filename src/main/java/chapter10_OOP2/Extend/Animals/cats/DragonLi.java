package chapter10_OOP2.Extend.Animals.cats;

public class DragonLi extends Cat{
    public static void main(String[] args) {
        DragonLi dragonLi = new DragonLi();
        String eatDrink = dragonLi.EatDrink();
        String catchMouse = dragonLi.CatchMouse();
        System.out.println(
                "中国狸花猫: "+eatDrink+","+catchMouse
        );
    }
}
