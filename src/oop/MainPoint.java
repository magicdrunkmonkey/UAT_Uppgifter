package oop;

public class MainPoint {

    public static void main(String[] args) {

        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(3.0, 0.0);

        Point point3 = new Point(point2);
        Point point4 = point3;

        // Point point3 = new Point(point2.getX(), point2.getY()); //copyConstructor

        point3.setX(4.0);
        System.out.println(point2);
        System.out.println(point3);

        double d = point1.distanceTo(point2);

        System.out.println(d);
    }
}
