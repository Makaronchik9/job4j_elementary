package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumFromZeroToTenThenFiftyFive() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromThreeToEightThenThirtyThree() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromOneToOneThenOne() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromFiveToThreeThenZero() {
        int start = 5;
        int finish = 3;
        int expected = 0; // Если start больше finish, возвращаем 0
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromNegativeThreeToThreeThenZero() {
        int start = -3;
        int finish = 3;
        int expected = 0;  // Проверка на отрицательные числа
        int result = Counter.sum(start, finish);
        assertThat(result).isNotEqualTo(expected);
    }

}
