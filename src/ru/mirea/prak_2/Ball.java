package ru.mirea.prak_2;

public class Ball {
    int radius;
    String colour;

    public Ball(int radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public int get_radius(){
        return radius;
    }
    public String get_colour(){
        return colour;
    }
}
