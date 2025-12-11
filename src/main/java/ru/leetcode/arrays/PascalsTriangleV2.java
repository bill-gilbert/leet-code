package ru.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleV2 {
    public List<Integer> getRow(int rowIndex) {
        int[] c = new int[rowIndex + 1];
        int i, j;
        List<List<Integer>> result = new ArrayList<>();
        for (i = 1; i < rowIndex; i++) {
            c[i] = 0;
        }
        c[0] = 1;
        result.add(List.of(1));
        for (j = 1; j < rowIndex; j++) {
            List<Integer> arrList = new ArrayList<>();
            for (i = j; i >= 1; i--) {
                c[i] = c[i - 1] + c[i];
            }
            for (int k=0; k <=j; k++) {
                arrList.add(c[k]);
            }
            result.add(arrList);
        }
        return Collections.emptyList();
    }
}
