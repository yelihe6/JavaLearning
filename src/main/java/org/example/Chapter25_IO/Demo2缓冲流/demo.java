package org.example.Chapter25_IO.Demo2缓冲流;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\张雪仪.txt");
        FileOutputStream fos = new FileOutputStream("src\\Chapter25_IO\\严欢欢.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int bb;

        while ((bb = bis.read()) != -1) {
            bos.write(bb);
        }

        bos.close();
        bis.close();


    }
}
