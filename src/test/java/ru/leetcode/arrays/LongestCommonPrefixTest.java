package ru.leetcode.arrays;

import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
    @Test
    void longestCommonPrefix() {
        val strs = new String[]{"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixEmpty() {
        val strs = new String[]{"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

}
