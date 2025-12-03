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

    // Horizontal scan
    public String longestCommonPrefixV2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
