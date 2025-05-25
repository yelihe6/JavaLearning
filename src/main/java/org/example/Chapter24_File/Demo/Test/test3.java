package org.example.Chapter24_File.Demo.Test;

import java.io.File;

public class test3 {
    public static void main(String[] args) {

        File file = new File("D:\\新建文件夹 (2)");
        findJPG(file);
    }

    //递归

    public static void findJPG(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()){
                    findJPG(file1);
                }
                if (file1.getName().endsWith(".jpg") || file1.getName().endsWith(".JPG")) {
                    System.out.println(file1);
                }
            }
        }
    }
}
