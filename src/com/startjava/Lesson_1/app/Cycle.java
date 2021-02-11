package com.startjava.Lesson_1.app;

public class Cycle {
    public static void main(String[] args) {
        for (int j = 0; j < 21; j++) {
            System.out.println("  " + j);
        }

        int k = 6;
        while (k >= -6) {
            System.out.println("  " + k);
            k--;
        }

        int f = 10;
        int sum = 0;
        do {
            if(f % 2 !=0) {
                sum += f;
            }
            f++;
        } while (f <= 20);
         System.out.println(sum);
    }
}