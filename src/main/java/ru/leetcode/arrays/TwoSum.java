package ru.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15, 5, 6};
        int[] nums = {-1, -2, -3, -4, -5};
        //int[] nums = {0,4,3,0};
        // int target = 11;
        //int target = 0;
        int target = -8;
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
        System.out.println(Arrays.toString(obj.twoSumV2(nums, target)));
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

    // Улучшенный код
    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            // cur + x = target
            // x = target - cur
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(cur, i);
        }
        return new int[]{0, 0};
    }

}
