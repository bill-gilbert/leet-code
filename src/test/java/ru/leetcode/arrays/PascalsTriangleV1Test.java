package ru.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleV1Test {
    // --- Тесты для треугольника Паскаля ---
    @Test
    public void testPascalsTriangleNumRows5() {
        PascalsTriangleV1 pascal = new PascalsTriangleV1();
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );

        assertEquals(expected, pascal.generate(5));
    }

    @Test
    public void testPascalsTriangleNumRows1() {
        PascalsTriangleV1 pascal = new PascalsTriangleV1();
        List<List<Integer>> expected = List.of(
                List.of(1)
        );

        assertEquals(expected, pascal.generate(1));
    }

    @Test
    public void testPascalsTriangleNumRows2() {
        PascalsTriangleV1 pascal = new PascalsTriangleV1();
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1)
        );
        assertEquals(expected, pascal.generate(2));
    }

    @Test
    public void testPascalsTriangleNumRows3() {
        PascalsTriangleV1 pascal = new PascalsTriangleV1();
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1)
        );
        assertEquals(expected, pascal.generate(3));
    }

    @Test
    public void testPascalsTriangleNumRows6() {
        PascalsTriangleV1 pascal = new PascalsTriangleV1();
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1),
                List.of(1, 5, 10, 10, 5, 1)
        );
        assertEquals(expected, pascal.generate(6));
    }
}