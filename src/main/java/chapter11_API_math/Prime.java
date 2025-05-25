package chapter11_API_math;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(65537));
    }



    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
