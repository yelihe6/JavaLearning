package Chapter25_IO.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TransformStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\chapter25_IO\\应鑫榆长大了.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String s;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        br.close();
    }
}
