package chapter10_OOP2.Interface.sportclub.PingPong;

import chapter10_OOP2.Interface.sportclub.English;
import chapter10_OOP2.Interface.sportclub.SportClubMember;

public class PingPong extends SportClubMember implements English {

    public String Type(String position) {
        return "乒乓球"+position;
    }

    public String action(String method){
        return method+"打乒乓球";
    }
    @Override
    public void speak() {
        System.out.print("说英语");
    }


    public PingPong() {
    }

    public PingPong(String name, String age) {
        super(name, age);
    }
}
