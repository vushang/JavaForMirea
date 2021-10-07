package ru.mirea.prak_3.nomer3_1;

import java.util.Scanner;

public class Circle_test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = sc.nextDouble();
        Circle circle_1 = new Circle(radius);
        System.out.println("Lenght :" + circle_1.get_length());
        System.out.println("Square:" + circle_1.get_square());
    }

}
