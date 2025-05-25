package Demo.Test;

import java.io.File;
import java.io.FilenameFilter;

public class test2 {

    public static void main(String[] args) {
        File file = new File("D:\\做爱的女朋友们");
        String[] list = file.list((File dir, String name) -> name.endsWith(".avi"));
//        assert list != null;
        try {
            for (String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        setAge(11);
    }

//    public static void setAge(int age) {
//        assert age > 0 : "Age must be positive";
//        System.out.println(age);
//    }

}
