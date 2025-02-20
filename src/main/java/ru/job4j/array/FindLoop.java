package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println(FindLoop.indexOf(data, 3));
        System.out.println(FindLoop.indexInRange(data, 3, 1, 3));
    }
}
