package Chapter25_IO.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;

public class Sort {

    public static void main(String[] args) throws IOException {

//        1-4-7-9-10-6-2

        FileReader fr = new FileReader("src\\Chapter25_IO\\张雪仪.txt");

        int b;
        StringBuilder str = new StringBuilder();
        while((b = fr.read()) != -1) {
            str.append((char) b);
        }



        String[] split = str.toString().split("-");
        for (int i = 0; i < split.length; i++) {
            split[i] =  split[i].strip();
        }
//        System.out.println(split[6]);
        Arrays.sort(split, (o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));

        Integer[] array = Arrays.stream(split).map(Integer::parseInt).sorted().toArray(Integer[]::new);

        String substring = Arrays.toString(array).replace(",", "-").substring(1, array.length - 1);

        String string = Arrays.toString(split);

        StringJoiner sj = new StringJoiner("-");

        for (int i = 0; i < split.length; i++) {
            sj.add(split[i]);
        }

        String string1 = sj.toString();

        FileWriter fw = new FileWriter("src\\Chapter25_IO\\张雪仪.txt");

        fw.write(string1);


        fw.close();
        fr.close();
    }
}
