package org.example.Chapter25_IO.Demo3转换流;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class demo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src\\chapter25_IO\\应鑫榆长大了.txt", Charset.forName("GBK"));

        int bb;

        while ((bb = fr.read()) != -1) {
            System.out.print((char) bb);
        }

        fr.close();
    }
}
