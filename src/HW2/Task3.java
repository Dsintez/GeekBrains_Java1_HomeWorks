package HW2;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {
                1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        };

        //Выводим все элементы массива в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }

        //Выводим все элементы массива в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}
