package ru.leetcode.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 5, 6};
        int target = 11;
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int index1 = -1; index1 < nums.length; ) {
            while (nums[index1] >= target && index1 < nums.length)  {
                ++index1;
            }
            int search = target - nums[index1];
            int index2 = index1 + 1;
            for (; index2 < nums.length && nums[index2] != search; index2++) ;
            if (index2 < nums.length) {
                return new int[]{index1, index2};
            }

        }
        return new int[]{0, 0};
    }
}
