package org.example.Chapter25_IO.权重随机算法;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightCalculation {

    public static void main(String[] args) throws IOException {
        //1. 收集到集合里面
        List<Student> studentList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src\\Chapter25_IO\\权重随机算法\\file.txt"));
        String bb;
        while ((bb = br.readLine()) != null) {
            studentList.add(new Student(bb.split("-")[0]
                    , bb.split("-")[1]
                    , Integer.parseInt(bb.split("-")[2])
                    , Double.parseDouble(bb.split("-")[3])));

        }
        //System.out.println(studentList);

        //2. 计算权重总和
        double TotalWeight = 0;
        for (Student student : studentList) {
            TotalWeight += student.getWeight();
        }

        //System.out.println(TotalWeight);

        //3. 计算每一个实际占比
        double[] ratio = new double[studentList.size()];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = studentList.get(i).getWeight() / TotalWeight;
        }

        //System.out.println(Arrays.toString(ratio));


        //4. 计算每一个权重的范围
        for (int i = 1; i < ratio.length; i++) {
            ratio[i] = ratio[i] + ratio[i-1];
        }

        //System.out.println(Arrays.toString(ratio));

        //5. 随机选取
        double random = Math.random();

        // - 插入点 - 1
        int result = Arrays.binarySearch(ratio, random);

        //插入点 = - result - 1
        int pointRange = - result - 1;
        System.out.println(pointRange);

        //6. 把选中的权重 / 2
        double w = studentList.get(pointRange).getWeight() / 2;
        studentList.get(pointRange).setWeight(w);

        //7. 数据再次写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Chapter25_IO\\权重随机算法\\file.txt"));
        for (Student student : studentList) {
            bw.write(student.toString());
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
