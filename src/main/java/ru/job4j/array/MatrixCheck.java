package ru.job4j.array;

public class MatrixCheck {
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            result[index] = board[index][index];
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                return false;
            }
        }
        return true;
    }
}