package ru.leetcode.arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int currIndex = 0;
        do {
            if (currIndex >= strs[0].length()) {
                return strs[0].substring(0, currIndex);
            }
            char ch = strs[0].charAt(currIndex);
            for (int i = 1; i < strs.length; i++) {
                if (currIndex >= strs[i].length() || strs[i].charAt(currIndex) != ch) {
                    return strs[0].substring(0, currIndex);
                }
            }
            currIndex++;
        } while (true);
    }
}
