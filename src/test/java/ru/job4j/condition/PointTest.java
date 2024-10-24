package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPointsAnd23And23Then0() {
        int x1 = 2, y1 = 3, x2 = 2, y2 = 3;
        double expected = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenPointsMinus3Minus4Minus7Minus1Then2Dot5() {
        int x1 = -3, y1 = -4, x2 = -7, y2 = -1;
        double expected = 5.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenPointsAnd2M2And4And4Then5Dot83() {
        int x1 = 2, y1 = 2, x2 = 4, y2 = 4;
        double expected = 2.83;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}