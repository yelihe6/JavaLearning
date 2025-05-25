package org.example.Chapter25_IO.Demo字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class demo4 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src\\Chapter25_IO\\金语彤宝宝.txt");
            int b;
            while ((b = fis.read()) != -1){
                System.out.print((char) b);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
