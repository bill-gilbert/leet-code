package ru.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertSortedArray2BinarySearchTreeTest {

    @Test
    void sortedArrayToBSTCase1Test() {

//        Input: nums = [-10,-3,0,5,9]
//        Output: [0,-3,9,-10,null,5]
//        Explanation: [0,-10,5,null,-3,null,9] is also accepted:
        int [] nums = new int[] {-10,-3,0,5,9};
        int [] correct = new int[] {-10,-3,0,5,9};
        ConvertSortedArray2BinarySearchTree convertSortedArray2BinarySearchTree = new ConvertSortedArray2BinarySearchTree();
        var result = convertSortedArray2BinarySearchTree.sortedArrayToBST(nums);
        Assertions.assertNotNull(result);
    }

    @Test
    void sortedArrayToBSTCase2Test() {
  //      Input: nums = [1,3]
  //      Output: [3,1]
  //      Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
        int [] nums = new int[] {1,3};
        int [] correct = new int[] {3,1};
        ConvertSortedArray2BinarySearchTree convertSortedArray2BinarySearchTree = new ConvertSortedArray2BinarySearchTree();
        var result = convertSortedArray2BinarySearchTree.sortedArrayToBST(nums);
        Assertions.assertNotNull(result);
    }
}