package org.example.Chapter25_IO.Test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ToZip {

    public static void main(String[] args) throws IOException {

        //文件夹  被压缩的物品
        File file = new File("src\\chapter25_IO\\girl");
        //获取压缩路径
        //System.out.println(file.getParent());
        File dest = new File(file.getParent(),file.getName()+".zip");
        //创建压缩输出流  压缩工厂
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //调用方法
        DirectoryToZip(file,zos,file.getName());
        //关闭
        zos.close();
    }

    public static void DirectoryToZip(File file,ZipOutputStream zos,String name) throws IOException {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isFile()) {
                    FileInputStream fis = new FileInputStream(file1);
                    ZipEntry ze = new ZipEntry(name + "\\" + file1.getName());
                    zos.putNextEntry(ze);
                    int bb;
                    while ((bb = fis.read()) != -1) {
                        zos.write(bb);
                    }
                    zos.closeEntry();
                    fis.close();
                }else {
                    DirectoryToZip(file1,zos,name + "\\" + file1.getName());
                }
            }

        }else {
            throw new RuntimeException("不是文件夹");
        }
    }
}
