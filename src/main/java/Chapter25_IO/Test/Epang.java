package Chapter25_IO.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Epang {
    public static void main(String[] args) throws Exception{
        FileReader fis = new FileReader("src\\Chapter25_IO\\apgf.txt");
        BufferedReader br = new BufferedReader(fis);
        List<String> list = new ArrayList<>();

        String bb;
        while ((bb = br.readLine()) != null) {
            list.add(bb);
        }
        System.out.println(list);

        List<String> collect = list.stream().sorted((o1, o2) -> Integer.parseInt(o1.split(". ")[0]) - Integer.parseInt(o2.split(". ")[0]))
                .toList();

        System.out.println(collect);

        FileWriter fw = new FileWriter("src\\Chapter25_IO\\apgf1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (String s : collect) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
