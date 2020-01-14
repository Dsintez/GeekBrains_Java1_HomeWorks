package HW1;

import java.util.Random;

public class LeapYear {
    public static void main(String[] args) {
        Random random = new Random();
        char chr = 'Y';
        byte by = 127;
        short shot = 6000;
        int integer = 32000;
        long lol = 100000000000L;

        String string = "GeekBrains";
        System.out.println("Hello " + string);

        double a = 1.5, b = 2.4, c = 3.3, d = 4.1;

        System.out.println("a = 1.5, b = 2.4, c = 3.3, d = 4.1");
        System.out.println("a * (b + (c / d)) = " + mathematicalOperation(a, b, c, d));
        System.out.println("5 + 5 больше 10 и меньше 20 (включительно) - " + (sumFromTenToTwenty(5,5) ? "да" : "нет"));
        System.out.println("число -1000 отрицательное? - " + (isNegativeNumber(-1000) ? "да" : "нет"));
        greeting("Олег Крылов");

        for (int i = 0; i < 25; i++){
            if (i%5 == 0) System.out.println();
            int year = random.nextInt(2020);
            System.out.print(year + (isLeapYear(year) ? "" : " не") + " високосный; ");
        }
    }

    public static double mathematicalOperation(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    public static boolean sumFromTenToTwenty(int a, int b){
        int c = a + b;
        return (c >= 10)&&(c <= 20);
    }

    public static boolean isNegativeNumber(int a){
        return a<0;
    }

    public static void greeting(String name){
        System.out.println("Привет, " + name);
    }

    public static boolean isLeapYear(int year){
        if(year%400 == 0) return true;
        else if (year%100 == 0) return false;
        else if (year%4 == 0) return true;
        else return false;
    }
}
