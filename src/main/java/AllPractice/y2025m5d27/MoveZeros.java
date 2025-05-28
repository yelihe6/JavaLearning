package AllPractice.y2025m5d27;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {

//        int[] arr = new int[nums.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = nums[i];
//        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[i];
                nums[index] = temp;
                index++;
            }
        }
        for (int i = 0; i < nums.length-index; i++) {
            nums[nums.length-1-i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
