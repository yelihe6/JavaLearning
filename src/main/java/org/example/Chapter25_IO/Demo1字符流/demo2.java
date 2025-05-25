package org.example.Chapter25_IO.Demo1字符流;

import java.io.FileReader;
import java.io.IOException;

public class demo2 {

    public static void main(String[] args) throws IOException {

        //字符流读取文件
        FileReader fr = new FileReader("src\\Chapter25_IO\\应鑫榆长大了.txt");

        //读取
        int each;
        while ((each = fr.read()) != -1) {
            System.out.print((char) each);
        }

        //关流
        fr.close();
    }
}
