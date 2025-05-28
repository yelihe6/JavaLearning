package AllPractice.y2025m5d27;

import java.util.Arrays;

public class GetTargetNumbers {
    public static void main(String[] args) {
        int[] arr = {-3,4,3,90};
        System.out.println(Arrays.toString(twoSum(arr, 0)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int index = nums.length;
//        while (true){
//            //System.out.println(nums[index-1] <= target);
//            if (nums[index-1] <= target){
//                break;
//            }
//            index--;
//        }


        for (int i = 0; i < index; i++) {
            for (int j = 1+i; j < index; j++) {
                if (nums[i]+nums[j] == target){
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        int[] noRes = {};
        return noRes;
    }
}
