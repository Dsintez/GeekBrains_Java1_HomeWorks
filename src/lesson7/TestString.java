package lesson7;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) throws InterruptedException {
        String s1 = "Java";
        String s2 = new String("Home");
        String s3 = new String(new char[]{'A', 'Z'});
        String s4 = new String(s3);
        String s5 = new String(new byte[]{65, 90});
        String s6 = new String(new byte[]{0, 65, 0, 90}, StandardCharsets.UTF_16);
        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s, s6 = %s%n", s1, s2, s3, s4, s5, s6);

        //Scanner scanner = new Scanner(System.in);
        //String w1 = "lol";//scanner.next();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long t1 = System.currentTimeMillis();
                String a = "";
                for (int i = 0; i < 12000; i++) {
                    a += "lol";
                }
                long t2 = System.currentTimeMillis();
                System.out.println("thread 1 - " + (t2 - t1));
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long t1 = System.currentTimeMillis();
                StringBuilder a = new StringBuilder("");
                for (int i = 0; i < 12000; i++) {
                    a.append("lol");
                }
                long t2 = System.currentTimeMillis();
                System.out.println("thread 2 - " + (t2 - t1));
            }
        });

        thread1.start();
        thread2.start();
    }
}
