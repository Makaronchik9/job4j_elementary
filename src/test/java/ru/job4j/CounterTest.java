package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumByEvenFrom0To10Then30() {
        int expected = 30;
        int result = Counter.sumByEven(0, 10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFrom3To8Then18() {
        int expected = 18;
        int result = Counter.sumByEven(3, 8);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFromNegative5To5Then0() {
        int expected = 0;
        int result = Counter.sumByEven(-5, 5);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFromNegative10ToNegative1Then30() {
        int expected = -30;
        int result = Counter.sumByEven(-10, -1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFrom5To5Then0() {
        int expected = 0;
        int result = Counter.sumByEven(5, 5);
        assertThat(result).isEqualTo(expected);
    }
}