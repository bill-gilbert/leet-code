package ru.leetcode.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CanPlaceFlowersTest {

    private final CanPlaceFlowers solution = new CanPlaceFlowers();

    // Источник данных для параметризованных тестов
    static Stream<Arguments> testCases() {
        return Stream.of(
                // Примеры из условия
                arguments(new int[]{1, 0, 0, 0, 1}, 1, true, "Пример 1"),
                arguments(new int[]{1, 0, 0, 0, 1}, 2, false, "Пример 2"),

                // Граничные случаи
                arguments(new int[]{0}, 1, true, "Одна пустая грядка, n=1"),
                arguments(new int[]{0}, 0, true, "Одна пустая грядка, n=0"),
                arguments(new int[]{1}, 0, true, "Одна занятая грядка, n=0"),
                arguments(new int[]{1}, 1, false, "Одна занятая грядка, n=1"),

                // n = 0 — всегда true
                arguments(new int[]{1, 0, 1, 0, 1}, 0, true, "n=0 на заполненной грядке"),
                arguments(new int[]{0, 0, 0}, 0, true, "n=0 на пустой грядке"),

                // Посадка по краям (частый источник ошибок)
                arguments(new int[]{0, 0, 0}, 2, true, "Три нуля, можно посадить 2 (по краям)"),
                arguments(new int[]{0, 0, 0, 0, 0}, 3, true, "Пять нулей, можно посадить 3"),

                // Ограничения соседними цветами
                arguments(new int[]{1, 0, 0, 0, 0, 1}, 2, false, "Между единицами 4 нуля, влезет только 1"),
                arguments(new int[]{0, 0, 1, 0, 0}, 2, true, "Единица в центре, можно посадить по краям"),

                // Длинные последовательности
                arguments(new int[]{0, 0, 0, 0, 0, 0, 0}, 4, true, "Семь нулей, влезет 4"),
                arguments(new int[]{0, 0, 0, 0, 0, 0, 0}, 5, false, "Семь нулей, 5 не влезет"),

                // Чередование
                arguments(new int[]{1, 0, 1, 0, 1, 0, 1}, 0, true, "Чередование, n=0"),
                arguments(new int[]{1, 0, 1, 0, 1, 0, 1}, 1, false, "Чередование, места совсем нет")
        );
    }

    @ParameterizedTest(name = "[{index}] {3}")
    @MethodSource("testCases")
    @DisplayName("Can Place Flowers")
    void canPlaceFlowers(int[] flowerbed, int n, boolean expected, String description) {
        // Клонируем массив, чтобы мутации внутри решения не ломали другие тесты
        int[] flowerbedCopy = flowerbed.clone();

        boolean result = solution.canPlaceFlowers(flowerbedCopy, n);

        assertEquals(expected, result, description);
    }
}