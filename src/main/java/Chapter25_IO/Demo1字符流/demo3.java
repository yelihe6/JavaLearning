package Chapter25_IO.Demo1字符流;

import java.io.FileReader;
import java.io.IOException;

public class demo3 {

    public static void main(String[] args) throws IOException {

        //字符流读取文件
        FileReader fr = new FileReader("src\\Chapter25_IO\\应鑫榆长大了.txt");

        char[] bt = new char[2];

        int each;

        while ((each = fr.read(bt)) != -1){
            System.out.print(new String(bt,0,each));
        }

        fr.close();
    }
}
