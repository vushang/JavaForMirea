package ru.mirea.prak_6;

public class MovableRectangle extends Rectangle implements Movable {
    private Point upperLeftPoint2;
    private Point lowerRightPoint2;

    public MovableRectangle(Point upperLeftPoint, Point lowerRightPoint) {
        super(upperLeftPoint, lowerRightPoint);

        upperLeftPoint2 = new Point(upperLeftPoint.getX(), upperLeftPoint.getY());
        lowerRightPoint2 = new Point(lowerRightPoint.getX(), lowerRightPoint.getY());
    }

    @Override
    public void move(int x, int y) {
        getUpperLeftPoint().setX(getUpperLeftPoint().getX() + x);
        getUpperLeftPoint().setY(getUpperLeftPoint().getY() + y);
        getLowerRightPoint().setX(getLowerRightPoint().getX() + x);
        getLowerRightPoint().setY(getLowerRightPoint().getY() + y);
    }

    public void CheckSpeed(){
        if(Math.sqrt(Math.pow(getUpperLeftPoint().getX() - upperLeftPoint2.getX() ,2) + Math.pow(getUpperLeftPoint().getY() - upperLeftPoint2.getY(), 2))
                == Math.sqrt(Math.pow(getLowerRightPoint().getX() - lowerRightPoint2.getX(), 2) + Math.pow(getLowerRightPoint().getY() - lowerRightPoint2.getY(), 2)))
            System.out.println("Speed is the same");
        else
            System.out.println("Speed is different");
    }

}