package Chapter25_IO.Test;

import java.io.*;
import java.util.Arrays;

public class Encryption {


    public static void main(String[] args) throws IOException {



        FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\girl2.png");
//        FileOutputStream fos = new FileOutputStream("src\\Chapter25_IO\\girl3.png");

        File file = new File("src\\Chapter25_IO\\girl3.png");

//        encrypt(fis,fos);

        decrypt(file);
    }

    public static void encrypt(FileInputStream fis, FileOutputStream fos) throws IOException {
        byte[] bt = new byte[1024];
        int bb;
        while((bb = fis.read(bt)) != -1){
            if (bt[0] < 127) {
                bt[0] += 1;
            }
            System.out.println(bt[0]);
            fos.write(bt,0,bb);
        }
        fos.close();
        fis.close();
    }

    public static void decrypt(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        File file1 = new File("src\\Chapter25_IO\\girl4.png");
        FileOutputStream fos = new FileOutputStream(file1);
        byte[] bt = new byte[1024];
        int bb;
        while((bb = fis.read(bt)) != -1){
            if (bt[0] < 127) {
                bt[0] -= 1;
            }
            System.out.println(bt[0]);

            fos.write(bt,0,bb);

        }
        fos.close();
        fis.close();
    }
}
