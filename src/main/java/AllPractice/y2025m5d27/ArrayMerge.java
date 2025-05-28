package AllPractice.y2025m5d27;

import java.util.Arrays;

public class ArrayMerge {

    //num
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;          // nums1中最后一个有效数字的索引
        int p2 = n - 1;          // nums2中最后一个数字的索引
        int p = m + n - 1;       // nums1中最后一个位置的索引

        // 从后往前合并
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // 如果 nums2 还有剩余，直接复制
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
                            //p1      p
        int[] nums1 = {1, 2, 3, 0, 0, 0};//6
        int m = 3;          //p2
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        // 输出结果
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }



}
