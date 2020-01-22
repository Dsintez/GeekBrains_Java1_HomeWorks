package HW2;

public class Task1 {
    public static void main(String[] args) {
        int[] binaryNumbers = new int[10];
        for (int i = 0; i < binaryNumbers.length; i++) {
            binaryNumbers[i] = (int) Math.rint(Math.random());
        }
        for (int i = 0; i < binaryNumbers.length; i++) {
            System.out.println(i + " - " + binaryNumbers[i]);
        }
        for (int i = 0; i < binaryNumbers.length; i++) {
            if (binaryNumbers[i] == 0) {
                binaryNumbers[i] = 1;
            } else {
                binaryNumbers[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < binaryNumbers.length; i++) {
            System.out.println(i + " - " + binaryNumbers[i]);
        }
    }
}
