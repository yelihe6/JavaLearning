package chapter11_API_math.自幂数;

public class Demo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000 ; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3) == (double)i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
