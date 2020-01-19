package HW2;

public class Task4 {
    public static void main(String[] args) {
        int length = 9;
        int[][] box = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || length-i-1 == j || length-j-1 == i) {
                    box[i][j] = 1;
                }
            }
        }

        //Выводим все элементы массива в консоль
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }
    }
}
