package HW2;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = i * 3;
        }

        //Test
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}
