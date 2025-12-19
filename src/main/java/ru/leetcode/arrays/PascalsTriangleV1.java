package ru.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleV1 {
    public List<List<Integer>> generate(int numRows) {
        int[] c = new int[numRows + 1];
        int i;
        List<List<Integer>> result = new ArrayList<>();
        for (i = 1; i < numRows; i++) {
            c[i] = 0;
        }
        c[0] = 1;
        result.add(List.of(1));
        for (int j = 1; j < numRows; j++) {
            List<Integer> arrList = new ArrayList<>();
            for (i = j; i >= 1; i--) {
                c[i] = c[i - 1] + c[i];
            }
            for (int k=0; k <=j; k++) {
                arrList.add(c[k]);
            }
            result.add(arrList);
        }
        return result;
    }
}
