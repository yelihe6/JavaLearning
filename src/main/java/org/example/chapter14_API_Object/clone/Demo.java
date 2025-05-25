package org.example.chapter14_API_Object.clone;

//import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr= {1,2,3,4,5,6};
        User u1 = new User("郑洁","18岁",arr);
//        System.out.println(u1);

        //克隆
        //方法在底层创建一个对象,并把对象拷贝过去
        //细节:
        //1.重写Object类中的clone方法
        //2.让Javabean类实现Clonable标记性接口
        //默认浅克隆
//        Object u2 = (User)u1.clone();
//        System.out.println(u1);
//        System.out.println(u2);

        //第三方工具(深克隆)
//        Gson g = new Gson();
//        String r = g.toJson(u1);
//        System.out.println(r);
//        User u2 = g.fromJson(r,User.class);
//        System.out.println(u2);

    }
}
