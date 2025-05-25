package org.example.chapter7_OOP.SomeTest.Fight;

public class FightGame {

    private String HeroName;
    private int blood;
    private int hurt;


    public FightGame() {
    }

    public FightGame(String HeroName, int blood, int hurt) {
        this.HeroName = HeroName;
        this.blood = blood;
        this.hurt = hurt;
    }

    /**
     * 获取
     * @return HeroName
     */
    public String getHeroName() {
        return HeroName;
    }

    /**
     * 设置
     * @param HeroName
     */
    public void setHeroName(String HeroName) {
        this.HeroName = HeroName;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     * @return hurt
     */
    public int getHurt() {
        return hurt;
    }

    /**
     * 设置
     * @param hurt
     */
    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

//    public String toString() {
//        return "FightGame{HeroName = " + HeroName + ", blood = " + blood + ", hurt = " + hurt + "}";
//    }
}
