package Chapter25_IO.Test;

import java.io.*;

public class CopyMethod {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\psc (16).jpg");
        FileOutputStream fos = new FileOutputStream("src\\Chapter25_IO\\psc (17).jpg");

        //System.out.println(copy1(fis,fos)); // ≈ 1462.0
        //System.out.println(copy2(fis,fos)); // ≈ 3.0
        //System.out.println(copy3(fis,fos)); // ≈ 24.0
        System.out.println(copy4(fis,fos)); // ≈ 2.0
    }

    public static Double copy1 (FileInputStream fis, FileOutputStream fos) throws IOException {
        long l = System.currentTimeMillis();
        int bb;
        while ((bb = fis.read()) != -1) {
            fos.write(bb);
        }

        long l1 = System.currentTimeMillis();


        fos.close();
        fis.close();
        return (double) l1-l;
    }

    public static Double copy2 (FileInputStream fis, FileOutputStream fos) throws IOException {
        long l = System.currentTimeMillis();
        byte[] c = new byte[1024];
        int bb;
        while ((bb = fis.read(c)) != -1) {
            fos.write(c,0,bb);
        }
        long l1 = System.currentTimeMillis();


        fos.close();
        fis.close();
        return (double) l1-l;
    }

    public static Double copy3 (FileInputStream fis, FileOutputStream fos) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long l = System.currentTimeMillis();
//        byte[] c = new byte[1024];
        int bb;
        while ((bb = bis.read()) != -1) {
            bos.write(bb);
        }
        long l1 = System.currentTimeMillis();


        bos.close();
        bis.close();
        return (double) l1-l;
    }

    public static Double copy4 (FileInputStream fis, FileOutputStream fos) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long l = System.currentTimeMillis();
        byte[] c = new byte[1024];
        int bb;
        while ((bb = bis.read(c)) != -1) {
            bos.write(c,0,bb);
        }
        long l1 = System.currentTimeMillis();


        bos.close();
        bis.close();
        return (double) l1-l;
    }
}
