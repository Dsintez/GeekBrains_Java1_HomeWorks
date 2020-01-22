package HW2;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 10;
        int[] array = new int[length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10000);
            System.out.print(array[i] + " "); //посмотрим на элементы массива
        }


        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nМаксимальное значение = " + max + "\nМинимальное значение = " + min);


    }
}
