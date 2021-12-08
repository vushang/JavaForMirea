package ru.mirea.prak_1;

import java.util.Arrays;


public class Main_random_massive {
    public static void getMass(int[] mass) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            int randomNumber = (int) (Math.random() * 6);
            mass[i] = randomNumber;
        }
        getMass(mass);
        Arrays.sort(mass);
        getMass(mass);
    }
}
