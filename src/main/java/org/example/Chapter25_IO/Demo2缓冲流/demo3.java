package org.example.Chapter25_IO.Demo2缓冲流;

import java.io.*;

public class demo3 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("src\\Chapter25_IO\\翁彩霞宝宝.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("翁彩霞");
        bw.newLine();
        bw.write("love");
        bw.newLine();


        bw.close();
    }
}
