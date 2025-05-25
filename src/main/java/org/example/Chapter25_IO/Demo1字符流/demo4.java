package org.example.Chapter25_IO.Demo1字符流;

import java.io.FileWriter;
import java.io.IOException;

public class demo4 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("src\\Chapter25_IO\\张温绮.txt", true);

        fw.write("小温绮");


        //关流
        fw.close();
    }
}
