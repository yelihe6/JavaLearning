package org.example.Chapter25_IO.Demo字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {

    public static void main(String[] args) {

        try {                                                                                   //是否续写
            FileOutputStream fos = new FileOutputStream("src\\Chapter25_IO\\金语彤宝宝.txt",true);

            String str = "xiangcaoni";
            byte[] bytes = str.getBytes();
            fos.write(bytes);

            String wrap = "\r\n";
            byte[] bytes1 = wrap.getBytes();
            fos.write(bytes1);


            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
