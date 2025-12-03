package ru.leetcode.arrays;


import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;

class RemoveElementTest {
    @Test
    void removeElementTest() {
        RemoveElement r = new RemoveElement();

        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = new int[]{0, 0, 1, 3, 4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = r.removeElement(nums, val); // Calls your implementation

        assert k == 5;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < 5; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void removeElementWithOneElemeTest() {
        RemoveElement r = new RemoveElement();

        int[] nums = new int[]{1}; // Input array
        int val = 1; // Value to remove
        int[] expectedNums = new int[]{}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = r.removeElement(nums, val); // Calls your implementation

        assert k == 0;
    }
}
