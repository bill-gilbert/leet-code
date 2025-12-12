package ru.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleV2 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return Collections.emptyList();
        }
        int[] elements = new int[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            elements[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                elements[j] = elements[j] + elements[j - 1];
            }
        }
        return Arrays.stream(elements).boxed().toList();
    }

    public int nCr(int n, int r) {
        long ans = 1;
        for (int i = 1; i <= r; i++) {
            ans *= (n - i + 1);
            ans /= i;
        }
        return (int) (ans);
    }

    public List<Integer> getRowV2(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0 || i == rowIndex)
                arr.add(1);
            else
                arr.add(nCr(rowIndex, i));

        }
        return arr;
    }
}
