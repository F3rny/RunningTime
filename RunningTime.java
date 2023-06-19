
import java.util.Scanner;

public class RunningTime {
    private static int sum;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = scr.nextInt();
        // int [] a = new int[n];
        System.out.println("m1: " + m1(n));
        System.out.println("m2: " + m2(n));
        System.out.println("m3: " + m3(n));
        System.out.println("m4: " + m4(n));
        System.out.println("m5: " + m5(n));
        System.out.println("m6: " + m6(n));
        scr.close(); /* NEW */
    }

    public static double m1(int n) {
        sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sum++;
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        return totalTime;
    }

    public static double m2(int n) {
        sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        return totalTime;

    }

    public static double m3(int n) {
        sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                sum++;
            }
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        return totalTime;
    }

    public static double m4(int n) {
        sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        return totalTime;
    }

    public static double m5(int n) {
        sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * i; j++) {
                for (int k = 0; k < j; k++) {
                    sum++;
                }
            }
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        return totalTime;

    }

    public static double m6(int n) {
        sum = 0;
        long start = System.nanoTime();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i * i; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++) {
                        sum++;
                    }
                }
            }
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        return totalTime;
    }
}
