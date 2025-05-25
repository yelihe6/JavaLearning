package org.example.method_test;

import java.util.Scanner;

public class Sell_tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sell_tickets sellTickets = new Sell_tickets();
        System.out.println("机场票价按月打折活动");
        System.out.println("-----------------");
        System.out.println("请输入你的原始票价: ");
        int tickets = scanner.nextInt();
        System.out.println("请输入月份: ");
        int month = scanner.nextByte();
        System.out.println("请输入你的座位舱: ");
        String position = scanner.next();

        int result = 0;
        if (month >= 1 && month <= 12){
            switch (position){
                case "头等舱", "经济舱" -> result = sellTickets.Tickets(tickets, month, position);
                default -> System.out.println("没有这个舱位!");
            }
        }else {
            System.out.println("不存在这个月份!");
        }
        System.out.println("打折后您的票价是: " + result);
    }



    public int Tickets(int price, int month, String position){
        if (month >= 5 && month <= 10){
            if (position.equals("头等舱")){
                price *= 0.90;
            } else if (position.equals("经济舱")) {
                price *= 0.85;
            }
        } else if (1 <= month && month < 5 || month <= 12 && month > 10) {
            if (position.equals("头等舱")){
                price *= 0.70;
            } else if (position.equals("经济舱")) {
                price *= 0.65;
            }
        }
        int new_price = price;
        return new_price;


    }
}
