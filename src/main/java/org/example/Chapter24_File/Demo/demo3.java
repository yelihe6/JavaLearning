package org.example.Chapter24_File.Demo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class demo3 {

    public static void main(String[] args) {

        File file = new File("D:\\开盒(慎用)");

//        File[] files = file.listFiles();
//        assert files != null;
//        for (File file1 : files) {
//            System.out.println(file1);
//        }
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                //endswith
                return src.isFile() && name.startsWith("张");
            }
        });

        System.out.println(Arrays.toString(list));
    }
}
