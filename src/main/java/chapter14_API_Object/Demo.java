package chapter14_API_Object;

public class Demo {
    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();//返回字符串表示形式
        System.out.println(string);

        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);

        //.equals() 比较两个对象是否相等

        String s = "abc";
        StringBuilder sb = new StringBuilder();
        System.out.println(s.equals(sb)); //false
        System.out.println(sb.equals(s)); //false


    }
}
