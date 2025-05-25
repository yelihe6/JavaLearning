package chapter6_method.about_method;

public class method {

    public int x ;
    public String y ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String z ;

    public static void print(){
        System.out.println("张铭慧纯洁可爱又善良");
    }




    public static void main(String[] args) {
        //方法是java程序的最小执行单元
        print();
        print();
        print();
    }
}
