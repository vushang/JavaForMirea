package ru.mirea.prak_4;

public class Rectangle extends Shape{
    double width;
    double lenght;

    public Rectangle(){
    }

    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getPerimetr(){
        return 2 * (lenght + width);
    }

    public double getArea(){
        return width * lenght;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
