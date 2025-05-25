package Chapter26_Thread.Test.GamblePrize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PricePool implements Runnable{

    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (PricePool.class) {
                List<Integer> list = new ArrayList<>();
                try {
                    FileReader fr = new FileReader("src\\Chapter26_Thread\\Test\\GamblePrize\\Money.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String bb;
                    while ((bb = br.readLine()) != null){
                        list.add(Integer.parseInt(bb));
                    }
                    if (list.isEmpty()){
                        break;
                    }
                    Random r = new Random();
                    int i = r.nextInt(0, list.size());
                    int res = list.get(i);
                    System.out.println(Thread.currentThread().getName()
                    +"又产生了一个"+res+"元大奖");
                    List<Integer> collect = list.stream().filter(integer -> integer != res).toList();
//                  System.out.println(collect);
                    FileWriter fw = new FileWriter("src\\Chapter26_Thread\\Test\\GamblePrize\\Money.txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    for (Integer integer : collect) {
                        bw.write(integer.toString());
                        bw.newLine();
                    }
                    br.close();
                    bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
