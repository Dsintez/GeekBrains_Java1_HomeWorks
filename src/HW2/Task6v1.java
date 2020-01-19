package HW2;

public class Task6v1 {
    public static void main(String[] args) {
        int[] array = {
                2, 2, 5, 1, 0, 6, 2, 5, 2, 7
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Сумма левой и правой части массива " + (checkBalance(array) ? "" : "не ") + "равны");
    }

    public static boolean checkBalance(int[] array) {
        int length = array.length;
        if (length < 2) return false;
        int sumLeft = array[0];
        int sumRight = array[length - 1];
        int left = 0, right = length - 1;

        for (int i = 1; i < length - 1; i++) {
            if (sumLeft > sumRight) {
                right--;
                sumRight += array[right];
            } else if (sumLeft < sumRight) {
                left++;
                sumLeft += array[left];
            } else if (sumLeft == sumRight) {
                if (array[left + 1] >= array[right - 1]) {
                    right--;
                    sumRight += array[right];
                } else if (array[left + 1] < array[right - 1]) {
                    left++;
                    sumLeft += array[left];
                }
            }
            //System.out.println(sumLeft + " | " + sumRight);
        }
        return sumLeft == sumRight;
    }
}
