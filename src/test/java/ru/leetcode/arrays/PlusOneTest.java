package ru.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    @Test
    void plusOneCase1() {
        int[] nums = new int[]{1,2,3}; // Input array
        PlusOne p = new PlusOne();
        Assertions.assertArrayEquals(new int[] {1,2,4}, p.plusOne(nums));
    }

    @Test
    void plusOneCase2() {
        int[] nums = new int[]{4,3,2,1}; // Input array
        PlusOne p = new PlusOne();
        Assertions.assertArrayEquals(new int[] {4,3,2,2}, p.plusOne(nums));
    }


    @Test
    void plusOneCase3() {
        int[] nums = new int[]{9}; // Input array
        PlusOne p = new PlusOne();
        int [] res = p.plusOne(nums);
        Assertions.assertArrayEquals(new int[] {1, 0}, res);
    }
}