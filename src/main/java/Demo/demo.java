package Demo;

import java.io.File;

public class demo {
    public static void main(String[] args) {


        //文件判断
        File file1 = new File("D:\\开盒(慎用)\\翁彩霞1012.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());

        System.out.println("=====================");

        //文件路径判断
        File file2 = new File("D:\\开盒(慎用)");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());


    }
}
