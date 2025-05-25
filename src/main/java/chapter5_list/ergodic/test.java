package chapter5_list.ergodic;

public class test {
    public static void main(String[] args) {

        double[] number1 = {1, 2, 3, 4, 5};
        for (int i = 0; i <= number1.length - 1; i++) {
            if (number1[i]%2 != 0){
                number1[i] *= 2;
            }else {
                number1[i] /= 2;
            }
        }
        for (int i = 0; i <= number1.length - 1; i++) {
            System.out.println(number1[i]);
        }

    }
}
