package Demo.Test;

import java.io.File;

public class test4 {

    public static void main(String[] args) {
        File file = new File("D:\\做爱的女朋友们");


        deleteDirectory(file);


    }

    public static void deleteDirectory(File file){
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
//                    File[] files1 = file1.listFiles();
//                    if (files1.length == 0) {
//                        System.out.println(file1);
//                        boolean delete = file1.delete();
//                    }else {
//                        deleteDirectory(file1);
//                    }
                    boolean delete = file1.delete();
                    if (!delete) {
                        deleteDirectory(file1);
                    }

                }
            }
        }
        file.delete();
    }
}
