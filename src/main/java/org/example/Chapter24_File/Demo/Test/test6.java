package org.example.Chapter24_File.Demo.Test;

import java.io.File;

public class test6 {

    public static void main(String[] args) {

        File file = new File("D:\\新建文件夹 (2)");

        long totalSpace = file.getTotalSpace();
        System.out.println(totalSpace);
    }
}
