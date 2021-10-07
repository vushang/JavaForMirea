package ru.mirea.prak_2;

public class Shape {
    String figure;
    public Shape(String figure) {
        this.figure = figure;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "figure='" + figure + '\'' +
                '}';
    }
}