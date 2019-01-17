package oop;

public class Point {

    private double x;
    private double y;


    //Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Copy constructor
    public  Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    //Getter och Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Default constructor
    @Override
    public String toString() {
        return "Point: " + x + "," + y;
    }

    public double distanceTo(Point other){
        Point p1 = this;
        Point p2 = other;

        double a = p2.x - p1.x;
        double b = p2.y - p1.y;

        double c = Math.sqrt( a * a + b * b );

        return c;

    }
}
