package chapter10_OOP2.Static.ArrayUtil;

public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {11,33,69,71,56,89};
        double[] arrd = {11.23,11.45,33.69,22.18};

        String get = ArrayUtil.printArr(arr);
        double v = ArrayUtil.getAverage(arrd);

        System.out.println(get);
        System.out.println(v);


    }
}
