package org.example.Chapter25_IO.Demo6解压缩流;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class demo {

    public static void main(String[] args) throws IOException {

        File zipFile = new File("src\\chapter25_IO\\text.zip");

        File dest = new File("src\\chapter25_IO\\");

        Zip(zipFile,dest);

    }

    public static void Zip(File zipFile, File dest) throws IOException {

//        File file1 = new File(dest,zipFile.getName());
//        boolean mkdirs = file1.mkdirs();
//        System.out.println(mkdirs);


        //解压输入流
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile), Charset.forName("GBK"));

        List<File> fileList = new ArrayList<>();

        //zip实体对象
        ZipEntry zipEntry;
        while ((zipEntry = zis.getNextEntry()) != null) {
            System.out.println(zipEntry);
            if (zipEntry.isDirectory()) {
                File file = new File(dest,zipEntry.toString());
                file.mkdirs();
            }else {
                File file = new File(dest,zipEntry.toString());
                fileList.add(file);
            }
        }

        for (File file : fileList) {
            FileOutputStream fos = new FileOutputStream(file);
            byte[] bt = new byte[1024];
            int bb;
            while ((bb = zis.read(bt)) != -1) {
                fos.write(bt, 0, bb);
            }
            fos.close();
        }

        zis.close();
    }
}
