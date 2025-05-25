package org.example.Chapter24_File.Demo.Test;

import java.io.File;
import java.util.TreeMap;

public class test5 {

    public static void main(String[] args) {

        File file = new File("D:\\新建文件夹 (2)");

        TreeMap<String , Integer> count = new TreeMap<>();

        suffix(file, count);

        count.forEach((s, integer) -> System.out.println(s +":"+integer));
    }

    public static void suffix(File file, TreeMap<String , Integer> count){
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()){
                    String substring = file1.getName().substring(file1.getName().lastIndexOf(".") + 1);
                    if (count.containsKey(substring)){
                        int num = count.get(substring);
                        num++;
                        count.put(substring,num);
                    }else {
                        count.put(substring,1);
                    }
                }else {
                    suffix(file1, count);
                }
            }
        }
    }
}
