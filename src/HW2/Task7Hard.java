package HW2;

public class Task7Hard {
    /**
     *
     * @param args Программа не работает(((
     */
    public static void main(String[] args) {
        int[] array = {
                1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //посмотрим на элементы массива
        }
        System.out.println();
        offsetArray(array, 5);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //посмотрим на элементы массива
        }
    }

    public static void offsetArray(int[] array, int offset) {
        if (offset == 0) return;
        int length = array.length;
        if (offset > length - 1 || -offset > length - 1) {
            if (offset < 0) offset = -(length % offset);
            else offset = length % offset;
        }
        if (offset*2 > length-1) offset = offset-length;
        int buffer1 = 0;
        int buffer2 = 0;
        if (offset < 0) {
            for (int i = length - 1; i > length + offset - 1; i--) {
                buffer1 = array[i - length - offset];
                buffer2 = array[i + offset];
                array[i + offset] = array[i];
                array[i] = buffer1;
                buffer1 = buffer2;
                for (int j = i + offset; j > -offset-1; j += offset) {
                    buffer2 = buffer1;
                    buffer1 = array[j + offset];
                    array[j + offset] = buffer2;
                }
            }
        } else {
            for (int i = 0; i < offset; i++) {
                buffer1 = array[i + length - offset];
                buffer2 = array[i + offset];
                array[i + offset] = array[i];
                array[i] = buffer1;
                buffer1 = buffer2;
                for (int j = i + offset; j < length - offset; j += offset) {
                    buffer2 = buffer1;
                    buffer1 = array[j + offset];
                    array[j + offset] = buffer2;
                }

            }
        }
    }
}
