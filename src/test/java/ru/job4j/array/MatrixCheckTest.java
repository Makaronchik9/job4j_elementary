package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMonoVerticalTrue() {
        char[][] board = {
                {'X', 'O', 'O'},
                {'X', 'O', 'O'},
                {'X', 'O', 'O'},
        };
        assertThat(MatrixCheck.monoVertical(board, 0)).isTrue();
    }

    @Test
    public void whenMonoVerticalFalse() {
        char[][] board = {
                {'X', 'O', 'O'},
                {'O', 'O', 'O'},
                {'X', 'O', 'O'},
        };
        assertThat(MatrixCheck.monoVertical(board, 0)).isFalse();
    }

    @Test
    public void whenMonoVerticalOnAnotherColumn() {
        char[][] board = {
                {'O', 'X', 'O'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'},
        };
        assertThat(MatrixCheck.monoVertical(board, 1)).isTrue();

    }

    @Test
    public void whenMonoVerticalAnotherColumnFalse() {
        char[][] board = {
                {'O', 'X', 'O'},
                {'O', 'O', 'O'},
                {'O', 'X', 'O'},
        };
        assertThat(MatrixCheck.monoVertical(board, 1)).isFalse();
    }
}