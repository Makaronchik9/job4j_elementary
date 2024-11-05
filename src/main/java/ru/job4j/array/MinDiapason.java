package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {6, 4, 1, 9, 8, 7, 3, 3, 2, 4, 9, 7, 5};
        int result = MinDiapason.findMin(array, 2, 9);
        System.out.println(result);
    }
}

