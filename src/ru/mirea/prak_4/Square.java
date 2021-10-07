package ru.mirea.prak_4;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }

    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public void setSide(double side){
        this.width = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.lenght = side;
    }

    public double getSide() {
        return this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + width +
                '}';
    }
}
