package org.example.Chapter25_IO.Demo3转换流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class demo2 {

    public static void main(String[] args) throws IOException {

        //FileWriter fw = new FileWriter("src\\chapter25_IO\\张铭慧.txt", Charset.forName("GBK"));

        //fw.write("张铭慧");

        //fw.close();

        //读取文件
        FileReader fr = new FileReader("src\\chapter25_IO\\张铭慧.txt", Charset.forName("GBK"));

        int bb;

        StringBuilder sb = new StringBuilder();

        while ((bb = fr.read()) != -1) {
            sb.append((char) bb);
        }

        fr.close();

        String string = sb.toString();

        FileWriter fw = new FileWriter("src\\chapter25_IO\\张铭慧.txt", StandardCharsets.UTF_8);

        fw.write(string);

        fw.close();
    }
}
