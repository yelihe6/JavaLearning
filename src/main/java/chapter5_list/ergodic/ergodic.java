package chapter5_list.ergodic;

public class ergodic {  //遍历
    public static void main(String[] args) {
        //求和
        int[] number = {1, 2, 3, 4, 5};
        int temp = 0;
        for (int i = 0; i <= number.length - 1; i++) {
            temp += number[i];
        }
        System.out.println(temp);

        //遍历
        String[] name = {"张铭慧", "陈文文", "郭晓晓", "林冉娴"};
        for (int i = 0; i < number.length - 1; i++) {
            System.out.println(name[i]);
        }

        //判断
        int count = 0;
        int[] number1 = {1, 2, 3, 4, 5};
        for (int i = 0; i <= number1.length - 1; i++) {
            if (number1[i]%2 == 0){
                System.out.println(number1[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
