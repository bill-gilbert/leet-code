package ru.leetcode.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int lastIndex = nums.length - 1;
        int index = 0;
        int count = 0;
        do {
            if (nums[index] == val) {
                while (index < lastIndex && nums[index] == nums[lastIndex]) {
                    --lastIndex;
                }
                if (index < lastIndex) {
                    nums[index] = nums[lastIndex];
                    --lastIndex;
                    ++index;
                    ++count;
                }
            } else {
                ++index;
                ++count;
            }
        } while (index < lastIndex);
        return count;
    }
}
