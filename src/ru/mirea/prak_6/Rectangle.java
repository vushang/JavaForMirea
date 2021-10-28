package ru.mirea.prak_6;

public class Rectangle {
    private Point upperLeftPoint;
    private Point lowerRightPoint;

    public Rectangle(Point upperLeftPoint, Point lowerRightPoint) {
        this.upperLeftPoint = upperLeftPoint;
        this.lowerRightPoint = lowerRightPoint;
    }

    public Point getUpperLeftPoint() {
        return upperLeftPoint;
    }

    public Point getLowerRightPoint() {
        return lowerRightPoint;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeftPoint=" + upperLeftPoint +
                ", lowerRightPoint=" + lowerRightPoint +
                '}';
    }
}