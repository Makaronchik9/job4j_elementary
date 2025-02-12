package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixCheckTest {
    @Test
    void whenColumnIsFullOfXThenTrue() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'O', 'X'}
        };
        assertTrue(MatrixCheck.monoVertical(board, 0));
        assertTrue(MatrixCheck.monoVertical(board, 2));
    }

    @Test
    void whenColumnHasDifferentCharsThenFalse() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'X'},
                {'X', 'O', 'O'}
        };
        assertFalse(MatrixCheck.monoVertical(board, 0));
        assertFalse(MatrixCheck.monoVertical(board, 1));
        assertFalse(MatrixCheck.monoVertical(board, 2));
    }
}