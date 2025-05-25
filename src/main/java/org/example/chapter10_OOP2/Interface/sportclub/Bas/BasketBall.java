package org.example.chapter10_OOP2.Interface.sportclub.Bas;

import chapter10_OOP2.Interface.sportclub.SportClubMember;

public class BasketBall extends SportClubMember {

    public String Type(String position) {
        return "篮球"+position;
    }

    public BasketBall() {
    }

    public BasketBall(String name, String age) {
        super(name, age);
    }


    public String action(String method){
        return method+"打篮球";
    }
}
