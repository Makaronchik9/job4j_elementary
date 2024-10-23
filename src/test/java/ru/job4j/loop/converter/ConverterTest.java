package ru.job4j.loop.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert200RblThen2dot5Dollar() {
        float in = 200;
        float expected = 2.5f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert180RblThen2Euro() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert160RblThen2Dollar() {
        float in = 160;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertEquals(expected, out, eps);
    }
}