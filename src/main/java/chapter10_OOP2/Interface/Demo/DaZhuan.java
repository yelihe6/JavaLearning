package chapter10_OOP2.Interface.Demo;

public class DaZhuan extends Students implements Decision{




    public DaZhuan() {
    }

    public DaZhuan(String name, String gender, String age, String diploma) {
        super(name, gender, age, diploma);
    }

    @Override
    public void review() {
        System.out.println("大专生的选择:");
        ZhuanShengBen();
        Kaoyan();
    }

    public void ZhuanShengBen(){
        System.out.println("专升本");
    }

    @Override
    public void Kaoyan() {
        System.out.println("考研");
    }

}
