package org.example.Chapter25_IO.Test;

import java.io.*;

public class AccessTime {

    public static void main(String[] args) throws Exception {
        File count = new File("src\\chapter25_IO\\count.txt");
        if (!count.isFile()){
            FileWriter fos = new FileWriter(count);
            BufferedWriter bw = new BufferedWriter(fos);
            bw.write("1");
            bw.close();
        }
        FileReader fis1 = new FileReader(count);
        BufferedReader bw = new BufferedReader(fis1);
        String read = bw.readLine();
        System.out.println(read);

        FileInputStream fis = new FileInputStream("src\\Chapter25_IO\\apgf1.txt");
        BufferedInputStream br = new BufferedInputStream(fis);
        if (Integer.parseInt(read) <= 3) {
            int bb;
            System.out.println("欢迎使用本软件 , 第"+read+"次使用免费");
            FileWriter fos = new FileWriter(count);
            BufferedWriter bw1 = new BufferedWriter(fos);
            bw1.write(Integer.parseInt(read)+1);
            bw1.close();
            while ((bb = br.read()) != -1) {
            }
        } else {
                System.out.println("本软件只能免费使用三次 , 请注册会员后使用");
        }
        br.close();
        bw.close();

    }
}
