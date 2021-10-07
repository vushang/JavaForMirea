package ru.mirea.prak_3.nomer3_1;

public class Circle {
    private final double PI = 3.14;
    private double radius;
    private double square;
    private double lenght;

    public Circle(double radius){
        this.radius = radius;
    }

    public void set_radius(double radius){
        this.radius = radius;
    }

    public double get_radius(){
        return radius;
    }

    public double get_square(){
        square = PI * radius * radius;
        return square;
    }

    public double get_length(){
        lenght = 2 * PI * radius;
        return lenght;
    }
}
