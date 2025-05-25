package chapter7_OOP.SomeTest.Fight;

import java.util.Random;
import java.util.Scanner;

public class Test {

//    public boolean hurt1(FightGame fightGame1,FightGame fightGame2){
//        Random random = new Random();
//        Test test = new Test();
//        if (fightGame1.getBlood()>0 && fightGame2.getBlood()>0){
//                if (fightGame2.getBlood()>fightGame1.getHurt()){
//                    while (true) {
//                        fightGame1.setHurt(random.nextInt(1, 11));
//                        int blood = fightGame2.getBlood();
//                        blood -= fightGame1.getHurt();
//                        fightGame2.setBlood(blood);
//                        System.out.println(
//                                fightGame1.getHeroName()+"对"+fightGame2.getHeroName()+
//                                        "造成了"+fightGame1.getHurt()+"点伤害\n"+"此时"+fightGame2.getHeroName()+
//                                        "还剩下"+blood+"滴血"
//                        );
//                        test.hurt2(fightGame2,fightGame1);
//
//                    }
//                }else {
//
//                        System.out.println( fightGame1.getHeroName()+"对"+fightGame2.getHeroName()+
//                                "造成了"+fightGame1.getHurt()+"点伤害");
//                        System.out.println("角色"+fightGame2.getHeroName()+"已经死亡");
//                        System.out.println(fightGame1.getHeroName()+"获得了胜利");
//
//                }
//
//
//            }
//
//
//        return false;
//    }
//
//    public boolean hurt2(FightGame fightGame2,FightGame fightGame1){
//        Random random = new Random();
//        Test test = new Test();
//        if (fightGame2.getBlood()>0 && fightGame1.getBlood()>0){
//
//                if (fightGame1.getBlood()>fightGame2.getHurt()){
//                    while (true){
//                        fightGame2.setHurt(random.nextInt(1,11));
//                        int blood = fightGame1.getBlood();
//                        blood -= fightGame2.getHurt();
//                        fightGame1.setBlood(blood);
//                        System.out.println(
//                                fightGame2.getHeroName()+"对"+fightGame1.getHeroName()+
//                                        "造成了"+fightGame2.getHurt()+"点伤害\n"+"此时"+fightGame1.getHeroName()+
//                                        "还剩下"+blood+"滴血"
//                        );
//                        test.hurt1(fightGame1,fightGame2);
//                    }
//                }else {
//
//                        System.out.println(fightGame2.getHeroName()+"对"+fightGame1.getHeroName()+
//                                "造成了"+fightGame2.getHurt()+"点伤害");
//                        System.out.println("角色"+fightGame1.getHeroName()+"已经死亡");
//                        System.out.println(fightGame2.getHeroName()+"获得了胜利");
//                    }
//
//                }
//
//
//
//
//        return false;
//    }
//
//
//    public static void main(String[] args) {
//        Test test = new Test();
//        FightGame fightGame1 = new FightGame();
//        FightGame fightGame2 = new FightGame();
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入两位英雄的名字:");
//        System.out.println("第一位:");
//        String Name1 = sc.next();
//        fightGame1.setHeroName(Name1);
//        System.out.println("第二位:");
//        String Name2 = sc.next();
//        fightGame2.setHeroName(Name2);
//        //初始血量100
//        fightGame1.setBlood(100);
//        fightGame2.setBlood(100);
//        test.hurt1(fightGame1,fightGame2);
//
//
//    }




}
