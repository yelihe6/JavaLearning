package org.example.chapter8_String.StringAPI;

public class StringApp {
    public static void main(String[] args) {

        // 字符串的内容自赋值后便不允许被更改
        // 建议直接赋值,节约内存
        String name = "郑洁";
        System.out.println(name);

        // 返回一个空的字符串
        String string = new String();
        System.out.println(string);

        //传递一个字符串,根据所传字符串创建一个新的字符串对象
        String transf = new String("李语童");
        System.out.println(transf);

        //传递一个字符串数组,根据字符数组的内容再创建一个新的字符串对象
        //修改字符串内容
        char[] str = {'a','b','c'};
        String charstr = new String(str);
        System.out.println(charstr);//abcd

        //传递一个字节数组,根据字节数组的内容再创建一个新的字节对象
        //从ASCII码当中查找
        //未来要把字节信息转换为字符串
        byte[] byte1 = {65,66,67,68};
        String NewStr = new String(byte1);
        System.out.println(NewStr);

    }
}
