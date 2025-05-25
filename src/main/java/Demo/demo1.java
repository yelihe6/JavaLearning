package Demo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {

    public static void main(String[] args) {
        //返回文件大小
        File file1 = new File("D:\\开盒(慎用)\\翁彩霞1012.txt");
        long time = file1.lastModified();
        System.out.println(time);

        //毫秒值转换时间
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String res = sdf.format(date);
        System.out.println(res);
    }
}
