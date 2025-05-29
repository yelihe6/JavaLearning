package AllPractice.y2025m5d29;

import java.util.Arrays;
import java.util.Random;

public class DutchNationalFlagProblem {
    public static void main(String[] args) {
//        int[] arr = new int[30];
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(0,3);
//        }
//        System.out.println(Arrays.toString(arr));
////        int[] res = result1(arr);
//        int[] res2 = result2(arr);
////        System.out.println(Arrays.toString(res));
//        System.out.println(Arrays.toString(res2));
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(sortColors2(nums)));
        // 输出结果应为 [0, 0, 1, 1, 2, 2]
//        System.out.println(Arrays.toString(nums));
    }



    //计数法
    public static int[] result1(int[] arr) {
        //0 1 2
        int count0 = 0,count1 = 0,count2 = 0;

        //计数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                count0++;
            }
            if (arr[i] == 1){
                count1++;
            }
            if (arr[i] == 2){
                count2++;
            }
        }

        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(arr.length);

        //填充
        for (int i = 0; i < arr.length; i++) {
            if (count0 > 0){
                arr[i] = 0;
                count0--;
            } else if (count0 == 0 && count1>0) {
                arr[i] = 1;
                count1--;
            } else if (count0 == 0 && count1 == 0 && count2>0){
                arr[i] = 2;
                count2--;
            }


        }
        return arr;
    }


    //0->2逐个遍历交换
    public static int[] result2(int[] arr) {
        int p0= 0;
        if (arr.length>1){
            //先交换0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0){
                    swap(arr,i,p0++);
                }
            }

            //再交换1
            for (int i = p0; i < arr.length; i++) {
                if (arr[i] == 1){
                    swap(arr,i,p0++);
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // 把 0 放到前面
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // 1 正好在中间，跳过
                    mid++;
                    break;
                case 2:
                    // 把 2 放到后面
                    swap(nums, mid, high);
                    high--;
                    // mid 不变，需要继续检查交换过来的新元素
                    break;
            }
//            System.out.println(Arrays.toString(nums));
        }
    }

    public static int[] sortColors2(int[] arr){
        //int[] nums = {2, 0, 2, 1, 1, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid <= high){
            System.out.println("low:"+low);
            System.out.println("mid:"+mid);
            System.out.println("high:"+high);
            System.out.println(Arrays.toString(arr));
            if (arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr,mid,high);
                high--;
            }

        }

        return arr;
    }
}
