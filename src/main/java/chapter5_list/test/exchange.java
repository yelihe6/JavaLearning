package chapter5_list.test;

public class exchange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        int temp = arr[0];
//        arr[0] = arr[arr.length-1];
//        arr[arr.length-1] = temp;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        for (int i = 0,j = arr.length - 1;i < j; i++ , j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }




    }
}
