package method_test;

import java.util.Random;
import java.util.Scanner;

public class Two_color_balls {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Two_color_balls twoColorBalls = new Two_color_balls();
//        int[] code = twoColorBalls.createNumber();
//        System.out.println("输入你的购买彩票号码----");
//        int[] self = new int[7];
//        for (int i = 0; i < 7; i++) {
//            if (i < 6){
//                System.out.println("请输入你的第"+(i+1)+"个红球号码");
//                int redNumber = scanner.nextInt();
//                redNumber = self[i];
//            }else {
//                System.out.println("请输入你的蓝球号码");
//                int blueNumber = scanner.nextInt();
//                blueNumber = self[i];
//            }
//        }
//        int countRed = 6;
//        int countBlue = 1;
//        for (int i = 0; i < 7; i++) {
//            if (i < 6){
//                if (self[i] != code[i]){
//                    countRed --;
//                }
//            } else {
//                if (self[i] != code[i]) {
//                    countBlue --;
//                }
//            }
//        }
//        if (countRed == 6 && countBlue == 1){
//            System.out.println("恭喜你中一等奖,最高1000万奖金");
//        } else if (countRed == 6 && countBlue == 0) {
//            System.out.println("恭喜你中二等奖,最高500万奖金");
//        } else if (countRed == 5 && countBlue == 1) {
//            System.out.println("恭喜你中三等奖,3000奖金");
//        } else if (countRed == 5 && countBlue == 0) {
//            System.out.println("恭喜你中四等奖,200奖金");
//        } else if (countRed == 4 && countBlue == 1) {
//            System.out.println("恭喜你中四等奖,200奖金");
//        } else if (countRed == 4 && countBlue == 0) {
//            System.out.println("恭喜你中五等奖,10奖金");
//        } else if (countRed == 3 && countBlue == 1) {
//            System.out.println("恭喜你中五等奖,10奖金");
//        } else if (countRed == 2 && countBlue == 1) {
//            System.out.println("恭喜你中六等奖,5奖金");
//        } else if (countRed == 1 && countBlue == 1) {
//            System.out.println("恭喜你中六等奖,5奖金");
//        } else if (countRed == 0 && countBlue == 1) {
//            System.out.println("恭喜你中六等奖,5奖金");
//        }else if (countRed == 0 && countBlue == 0) {
//            System.out.println("很遗憾您未能中奖~");
//        }
//        for (int i = 0; i < code.length; i++) {
//            System.out.print(code[i]+" ");
//        }
//    }
//    public int[] createNumber(){
//        // 生成长度为7的数组
//        Two_color_balls twoColorBalls = new Two_color_balls();
//        Random r = new Random();
//        int[] code = new int[7];
//        for (int i = 0; i < code.length - 1;) {
//            //红球不能重复
//                int redNumber = r.nextInt(1,34);
//                //不重复判断※
//                boolean flag = twoColorBalls.contains(code,redNumber);
//                if (!flag) {
//                    code[i] = redNumber;
//                    i++;
//                }
//        }
//        int blueNumber = r.nextInt(1,17);
//        code[code.length-1] = blueNumber;
//        return code;
//    }
//    public boolean contains(int[] arr,int number){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == number){
//                return true;
//            }
//        }
//        return false;
//    }
}
