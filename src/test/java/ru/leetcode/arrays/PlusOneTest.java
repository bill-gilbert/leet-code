package ru.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {
    /**
     Example 1:

     Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     Output: [1,2,2,3,5,6]
     Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

     Example 2:

     Input: nums1 = [1], m = 1, nums2 = [], n = 0
     Output: [1]
     Explanation: The arrays we are merging are [1] and [].
     The result of the merge is [1].

     Example 3:

     Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     Output: [1]
     Explanation: The arrays we are merging are [] and [1].
     The result of the merge is [1].
     Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
     */


    @Test
    void plusOneCase1() {
        int[] nums1 = new int[]{1,2,3,0,0,0}; // Input array
        int m = 3;
        int[] nums2 = new int[]{2,5,6}; // Input array
        int n = 3;
        int[] output = new int [] {1,2,2,3,5,6};
    }

    @Test
    void plusOneCase2() {
        int[] nums1 = new int[]{}; // Input array
        int m = 1;
        int[] nums2 = new int[]{}; // Input array
        int n = 0;
        int[] output = new int [] {1};
    }


    @Test
    void plusOneCase3() {
        int[] nums1 = new int[]{0}; // Input array
        int m = 0;
        int[] nums2 = new int[]{1}; // Input array
        int n = 1;
        int[] output = new int [] {1};
    }
}