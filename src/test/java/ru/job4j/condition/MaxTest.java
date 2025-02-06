package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMaxTwoNumbers() {
        assertEquals(2, Max.max(1, 2));
        assertEquals(5, Max.max(5, 3));
        assertEquals(7, Max.max(7, 7));
    }

    @Test
    void whenMaxThreeNumbers() {
        assertEquals(3, Max.max(1, 2, 3));
        assertEquals(10, Max.max(10, 5, 8));
        assertEquals(6, Max.max(6, 6, 6));
    }

    @Test
    void whenMaxFourNumbers() {
        assertEquals(4, Max.max(1, 2, 3, 4));
        assertEquals(15, Max.max(10, 15, 8, 12));
        assertEquals(9, Max.max(9, 9, 9, 9));
    }
}
