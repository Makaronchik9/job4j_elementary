package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void whenPointsAreSameThenDistanceIsZero() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(1, 2, 3);
        double result = a.distance3d(b);
        assertEquals(0.0, result);
    }

    @Test
    public void whenPointsAreDifferentThenCalculateDistance() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 6, 8);
        double result = a.distance3d(b);
        assertEquals(7.071, result, 0.001);
    }
}