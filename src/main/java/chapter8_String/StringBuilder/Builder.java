package chapter8_String.StringBuilder;

public class Builder {

    public static void main(String[] args) {

        //字符串的加工厂
        StringBuilder sb1 = new StringBuilder(); //空字符串容器
        StringBuilder sb2 = new StringBuilder("abc"); //开头为abc的字符串容器

        //往后添加(拼接)字符串
        sb1.append("我爱你")
                .append(",今日份快乐的你")
                .append(",伴你成长")
                .append(".");        //链式调用
        int k = sb1.length();   //字符串长度
        //sb1.reverse();  //反转

        System.out.println(k);
        System.out.println(sb1);


        //变成字符串
        String s = sb1.toString();
        System.out.println(s);
    }



}
