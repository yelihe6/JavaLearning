package Chapter25_IO.Demo5打印流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class demo {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("src\\chapter25_IO\\张温绮.txt");

        PrintStream ps = new PrintStream(fos,true, StandardCharsets.UTF_8);

        ps.print(97);
        ps.println();
        ps.println("可爱");
        ps.printf("%s爱%s", "我", "张温绮");

        ps.close();

        System.out.println();
        System.out.print("");;
        System.out.printf("%s","ok");
    }
}
