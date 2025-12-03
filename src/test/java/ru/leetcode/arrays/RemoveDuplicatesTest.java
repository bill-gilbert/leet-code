package ru.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicatesCase1Test() {
        int[] arr = new int[]{1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int result = removeDuplicates.removeDuplicates(arr);
        Assertions.assertEquals(2, result);
    }

    @Test
    void removeDuplicatesCase2Test() {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int result = removeDuplicates.removeDuplicates(arr);
        Assertions.assertEquals(5, result);
    }

}