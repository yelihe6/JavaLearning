package org.example.Chapter25_IO.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Copy {

    public static void main(String[] args) throws Exception {


        //不能直接复制文件夹
//        FileInputStream fis = new FileInputStream("D:\\做爱的女朋友们");
//        FileOutputStream fos = new FileOutputStream("src\\做爱");

        File file = new File("D:\\做爱的女朋友们");

        File position = new File("src\\做爱");

        CopyDirectory(file,position);
    }

    public static void CopyDirectory(File file, File position) throws Exception {
        if (file != null) {
            boolean mkdir = position.mkdir();
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    if (file1.isDirectory()) {
                        File file2 = new File(position+"\\"+file1.getName());
                        CopyDirectory(file1,file2);
                    }else {



                        File file2 = new File(position+"\\"+file1.getName());
                        FileInputStream fis = new FileInputStream(file1);
                        FileOutputStream fos = new FileOutputStream(file2);

                        // 复制文件
                        //Files.copy(file1.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);

                        byte[] bt = new byte[2];

                        int bb;

                        while ((bb = fis.read(bt)) != -1) {
                            fos.write(bt,0,bb);
                        }
                        fos.close();
                        fis.close();
                    }
                }
            }else {
//                fis = new FileInputStream(file);
//                fos = new FileOutputStream("src\\Chapter25_IO\\"+file.getName());
                throw new  InvalidFileException("不是文件夹");
            }

        }
    }
}

class InvalidFileException extends Exception {
    public InvalidFileException(String message) {
        super(message);
    }
}
