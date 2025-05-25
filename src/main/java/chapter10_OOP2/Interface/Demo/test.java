package chapter10_OOP2.Interface.Demo;

import java.util.StringJoiner;

public class test {
    public static void main(String[] args) {
        DaZhuan daZhuan = new DaZhuan("武美梦","女","19岁","大专");

        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        stringJoiner.add(daZhuan.getName());
        stringJoiner.add(daZhuan.getGender());
        stringJoiner.add(daZhuan.getAge());
        stringJoiner.add(daZhuan.getDiploma());
        daZhuan.review();
    }
}
