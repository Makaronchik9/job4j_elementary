package ru.job4j.loop.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void rubleToEuro() {
        float rubles = 180.0f;
        float expected = 2.0f;
        float result = Converter.rubleToEuro(rubles);
        assertThat(result).isEqualTo(expected, withPrecision(0.01f));
    }

    @Test
    void rubleToDollar() {
        float rubles = 160.0f;
        float expected = 2.0f;
        float result = Converter.rubleToDollar(rubles);
        assertThat(result).isEqualTo(expected, withPrecision(0.01f));
    }
}