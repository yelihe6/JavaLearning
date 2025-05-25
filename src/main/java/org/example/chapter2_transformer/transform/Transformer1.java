package org.example.chapter2_transformer.transform;

public class Transformer1 {
    public static void main(String[] args) {
        // 隐式转换     取值范围小的变大的
        // 自动类型提升
        // TODO byte < short < int < long < float < double
        int a = 10;
        double b = 3.14;
        double c = a+b;

        int a1 = 10;
        double a2 = 10.0;
        double a3 = a1 + a2;
    }
}
