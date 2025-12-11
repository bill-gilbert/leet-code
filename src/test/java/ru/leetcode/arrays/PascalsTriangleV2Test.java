package ru.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleV2Test {
    // --- Тесты для треугольника Паскаля ---

    @Test
    public void testPascalsTriangleNumRows1() {
        PascalsTriangleV2 pascal = new PascalsTriangleV2();
        List<Integer> expected = List.of(1);

        assertEquals(expected, pascal.getRow(0));
    }

    @Test
    public void testPascalsTriangleNumRows2() {
        PascalsTriangleV2 pascal = new PascalsTriangleV2();
        List<Integer> expected = List.of(1, 2, 1);
        assertEquals(expected, pascal.getRow(2));
    }

    @Test
    public void testPascalsTriangleNumRows3() {
        PascalsTriangleV2 pascal = new PascalsTriangleV2();
        List<Integer> expected = List.of(1, 3, 3, 1);
        assertEquals(expected, pascal.getRow(3));
    }

    @Test
    public void testPascalsTriangleNumRows4() {
        PascalsTriangleV2 pascal = new PascalsTriangleV2();
        List<Integer> expected = List.of(1, 5, 10, 10, 5, 1);

        assertEquals(expected, pascal.getRow(5));
    }

    @Test
    public void testPascalsTriangleNumRows5() {
        PascalsTriangleV2 pascal = new PascalsTriangleV2();
        List<Integer> expected = List.of(1, 6, 15, 20, 15, 6, 1);
        assertEquals(expected, pascal.getRow(6));
    }
}