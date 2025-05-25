package chapter2_transformer.transform;

public class Transformer2 {
    public static void main(String[] args) {
        // byte  -128 ~ +127
        double a = 520.1;
        //强制转换: 大的转小的
        int b = (int) a;
        System.out.println(b);
    }
}
