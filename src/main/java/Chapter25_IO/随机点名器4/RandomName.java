package Chapter25_IO.随机点名器4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class RandomName {


    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("src\\Chapter25_IO\\随机点名器4\\name.txt");

        NameMethod(file);

    }

    public static void NameMethod(File name) throws IOException, InterruptedException {
        FileInputStream fis = new FileInputStream(name);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);


        FileReader fr = new FileReader("src\\Chapter25_IO\\随机点名器4\\tempName.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);

        List<String> names = new ArrayList<>();

        String n;
        while ((n = br.readLine()) != null) {
            names.add(n);
        }
        System.out.println(names);
//        int bb = bufferedReader.read();
//        System.out.println(bb);
//        //流程1 , 判断temp是否为空
//        if (bb == -1) {
//            Random random = new Random();
//            int i = random.nextInt(names.size() + 1);
//            FileWriter fw = new FileWriter("src\\Chapter25_IO\\随机点名器4\\tempName.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(names.get(i));
//            System.out.println(names.get(i));
//            //\r\n
//            bw.newLine();
//            bw.close();
//        }
        //流程2 , 非空
        List<String> temp = new ArrayList<>();
        List<String> noName = new ArrayList<>();
        String s;
        while ((s = bufferedReader.readLine()) != null) {
                temp.add(s);
        }
//        List<String> list = temp.stream().filter(s1 -> s1.equals(666)).toList();
        System.out.println(temp);
        if (!(temp.size() == names.size())) {
            for (String string : names) {
                boolean having = false;
                    for (String s1 : temp) {
                        if (Objects.equals(s1, string)) {
                            having = true;
                            break;
                        }
                    }
                    if (!having) {
                        noName.add(string);
                    }
                }
            System.out.println(noName);
                Random random = new Random();
                int i = random.nextInt(noName.size());
                FileWriter fw = new FileWriter("src\\Chapter25_IO\\随机点名器4\\tempName.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(noName.get(i));
                System.out.println(noName.get(i));
                bw.newLine();
                bw.close();
            }else {
//                System.out.println("本次点名已经结束 , 即将进入下一次点名....");
//                Thread.sleep(2000);
                Random random = new Random();
                int i = random.nextInt(names.size());
                FileWriter fw = new FileWriter("src\\Chapter25_IO\\随机点名器4\\tempName.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(names.get(i));
                System.out.println(names.get(i));
                //\r\n
                bw.newLine();
                bw.close();
            }
        br.close();
    }
}
