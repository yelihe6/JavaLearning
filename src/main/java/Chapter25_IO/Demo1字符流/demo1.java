package Chapter25_IO.Demo1字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo1 {


    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "应鑫榆loveyou~";


        //编码
        byte[] bytes = str.getBytes();

        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str.getBytes("GBK");

        System.out.println(Arrays.toString(bytes1));


        //解码
        String decoding = new String(bytes);
        System.out.println(decoding);

        String decoding1 = new String(bytes,"GBK");
        System.out.println(decoding1);
    }
}
