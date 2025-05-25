package Chapter25_IO.Demo字节流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo5 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\应鑫榆长大了.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 指定正确的字符编码
        BufferedReader reader = new BufferedReader(isr);

        int b;
        String line;
//        while ((b = fis.read()) != -1) {
//            System.out.print((char) b);
//        }

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        fis.close();
    }
}
