package Chapter25_IO.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class XOREnde {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\girl2.JPG");
        FileOutputStream fos = new FileOutputStream("src\\Chapter25_IO\\girl3.JPG");

        int b;
        while ((b = fis.read()) != -1) {
            //异或
            fos.write(b ^ 2);
        }

        fos.close();
        fis.close();

    }
}
