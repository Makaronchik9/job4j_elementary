package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHasElementThenReturnIndex() {
        int[] data = new int[] {5, 10, 3, 7, 9};
        int element = 7;
        int result = FindLoop.indexOf(data, element);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayDoesNotHaveElementThenReturnMinus1() {
        int[] data = new int[] {5, 10, 3, 7, 9};
        int element = 4;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}