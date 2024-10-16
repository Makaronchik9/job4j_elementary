package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected); // Проверка для 5!
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected); // Проверка для 0!
    }

    @Test
    void whenCalculateFactorialForOneThenOne() {
        int expected = 1;
        int number = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected); // Проверка для 1!
    }

    @Test
    void whenCalculateFactorialForThreeThenSix() {
        int expected = 6;
        int number = 3;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected); // Проверка для 3!
    }

    @Test
    void whenCalculateFactorialForTenThen3628800() {
        int expected = 3628800;
        int number = 10;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected); // Проверка для 10!
    }
}