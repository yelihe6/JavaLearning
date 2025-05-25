package org.example.Chapter25_IO.Demo字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("D:\\做爱的女朋友们\\想操翁彩霞.txt");
            FileOutputStream fos1 = new FileOutputStream("src\\Chapter25_IO\\金语彤宝宝.txt");

            fos1.write(99);

            //释放资源
            fos1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
