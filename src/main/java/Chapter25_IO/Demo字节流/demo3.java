package Chapter25_IO.Demo字节流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo3 {

    public static void main(String[] args) {


//        try {
//
//            FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\金语彤宝宝.txt");
//
//            byte[] bytes = fis.readAllBytes();
//
//            char[] chars = new char[bytes.length];
//
//            for (int i = 0; i < bytes.length; i++) {
//                chars[i] = (char) bytes[i];
//                System.out.println(chars[i]);
//            }
//            System.out.println(Arrays.toString(chars));
//
//            fis.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\金语彤宝宝.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 指定正确的字符编码
            BufferedReader reader = new BufferedReader(isr);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
