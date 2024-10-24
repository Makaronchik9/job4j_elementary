package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength8AndWidth15ThenDiagonal17() {
        double length = 8;
        double width = 15.0;
        double expected = 17.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLengthMinus3AndWidth4ThenDiagonal5() {
        double length = -3;
        double width = 4;
        double expected = 5;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength0AndWidth5ThenDiagonal5() {
        double length = 0;
        double width = 5;
        double expected = 5;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}