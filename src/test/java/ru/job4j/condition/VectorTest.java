package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class VectorTest {

    @Test
    void whenVectors12And34ThenResult45() {
        int x1 = 3, y1 = 4, x2 = 6, y2 = 8;
        String expected = "(9, 12)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12And34ThenResult22() {
        int x1 = -3, y1 = -5, x2 = 2, y2 = 5;
        String expected = "(-1, 0)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus46() {
        int x1 = -2, y1 = -1, x2 = -5, y2 = -7;
        String expected = "(-7, -8)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}