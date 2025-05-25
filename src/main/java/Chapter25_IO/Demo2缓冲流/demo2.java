package Chapter25_IO.Demo2缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo2 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src\\Chapter25_IO\\严欢欢.txt");
        BufferedReader br = new BufferedReader(fr);

        String s;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        br.close();
    }
}
