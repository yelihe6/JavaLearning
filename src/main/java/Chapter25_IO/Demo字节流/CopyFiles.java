package Chapter25_IO.Demo字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) throws IOException {

        //源文件 写入
        FileInputStream fos = new FileInputStream("D:\\新建文件夹 (2)\\新建文件夹 (8)\\新建文件夹\\picture1.png");

        //目的地 读出
        FileOutputStream fis = new FileOutputStream("src\\Chapter25_IO\\girl.png");

        byte[] bytes = new byte[1024*1024*5];

        long l = System.currentTimeMillis();
        int b;
        while ((b = fos.read(bytes)) != -1){
            fis.write(bytes ,0, b);
        }
        long l1 = System.currentTimeMillis();

        fis.close();
        fos.close();

        System.out.println(l1-l);
    }
}
