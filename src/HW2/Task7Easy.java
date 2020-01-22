package HW2;

public class Task7Easy {
    public static void main(String[] args) {
        int[] array = {
                1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //посмотрим на элементы массива
        }
        System.out.println();

        array = offsetArray(array, 5);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //посмотрим на элементы массива
        }
    }

    public static int[] offsetArray(int[] array, int offset) {
        int[] helpArray = new int[array.length];
        int length = array.length;

        if (offset < 0) {
            offset = length + offset;
        } else {
            offset++;
        }
        for (int i = 0; i < length; i++) {
            if (i + offset > length - 1) {
                helpArray[offset - (length - i)] = array[i];
            } else {
                helpArray[i + offset] = array[i];
            }
        }
        return helpArray;
    }
}
