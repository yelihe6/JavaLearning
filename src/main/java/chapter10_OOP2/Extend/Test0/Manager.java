package chapter10_OOP2.Extend.Test0;

public class Manager extends Profession{

    private String ManageAward;
    public String getManageAward() {
        return ManageAward;
    }

    public void setManageAward(String manageAward) {
        ManageAward = manageAward;
    }

    public String set(String Salary){
        setManageAward(Salary);
        return getManageAward();
    }


    public Manager() {
        super("10086","张三","6000");
    }




}
