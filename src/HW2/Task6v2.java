package HW2;

public class Task6v2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 0, 1};

        System.out.println(methodMyFriends(array));
    }

    public static boolean methodMyFriends(int[] array) {
        int sumArray = 0;

        for (int i : array) {
            sumArray += i;
        }
        if (sumArray % 2 == 0) {
            sumArray = sumArray / 2;
            int left = 0;
            for (int i : array) {
                left += i;
                if (left == sumArray) {
                    return true;
                } else if (left > sumArray) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
