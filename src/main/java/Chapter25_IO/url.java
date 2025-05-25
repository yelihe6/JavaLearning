package Chapter25_IO;

import java.io.File;

public class url {

    public static void main(String[] args) {

        File file = new File("https://catserve.oss-cn-hangzhou.aliyuncs.com/0d6eca16-f8b1-4db4-a110-62b7dfb6378a.jpg");
        System.out.println(file.length());

    }
}
