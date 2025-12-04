package ru.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertTest {
    @Test
    void searchInsertCase1Test() {
        int[] arr = new int[]{1,3,5,6};
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(arr, 5);
        Assertions.assertEquals(2, result);
    }

    @Test
    void searchInsertCase2Test() {
        int[] arr = new int[]{1,3,5,6};
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(arr, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void searchInsertCase3Test() {
        int[] arr = new int[]{1,3,5,6};
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(arr, 7);
        Assertions.assertEquals(4, result);
    }
}