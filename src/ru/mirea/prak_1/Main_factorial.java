package ru.mirea.prak_1;

import java.util.Scanner;

public class Main_factorial {

    public static int factorial(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }
}
