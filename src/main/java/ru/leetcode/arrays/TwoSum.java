package ru.leetcode.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15, 5, 6};
        int[] nums = {-1,-2,-3,-4,-5};
        //int[] nums = {0,4,3,0};
        // int target = 11;
        //int target = 0;
        int target = -8;
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int index1 = 0; index1 < nums.length; ) {
            int search = target - nums[index1];
            int index2 = index1 + 1;
            for (; index2 < nums.length && nums[index2] != search; index2++) ;
            if (index2 < nums.length) {
                return new int[]{index1, index2};
            }
            ++index1;
        }
        return new int[]{0, 0};
    }
}
