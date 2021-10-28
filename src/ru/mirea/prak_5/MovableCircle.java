package ru.mirea.prak_5;

public class MovableCircle extends Circle implements Movable {

    public MovableCircle(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        getCenter().setX(getCenter().getX() + x);
        getCenter().setY(getCenter().getY() + y);
    }
}