package HW2;

import java.util.Arrays;

public class Task7Hard {
    /**
     * @param args Программа работает)))
     */
    public static void main(String[] args) {
        int[] array = {
                1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        };
        System.out.print(Arrays.toString(array));
        System.out.println();
        offsetArray(array, 5);

        System.out.print(Arrays.toString(array));
        System.out.println();
        offsetArray(array, -5);

        System.out.print(Arrays.toString(array));
        System.out.println();
        offsetArray(array, 19);

        System.out.print(Arrays.toString(array));
        System.out.println();
        offsetArray(array, -19);

        System.out.print(Arrays.toString(array));
        System.out.println();
        offsetArray(array, 12);

        System.out.print(Arrays.toString(array));
    }

    public static void offsetArray(int[] array, int offset) {
        offset = offset % array.length;
        if (offset == 0) return;
        if (offset < 0) {
            offsetRight(array, offset);
        } else {
            offsetLeft(array, offset);
        }
    }

    private static void offsetLeft(int[] array, int offset) {
        offset = Math.abs(offset);
        for (int i = 0; i < offset; i++) {
            int firstElem = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElem;
        }
    }

    private static void offsetRight(int[] array, int offset) {
        offset = Math.abs(offset);
        for (int i = 0; i < offset; i++) {
            int lastElem = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastElem;
        }
    }
}
