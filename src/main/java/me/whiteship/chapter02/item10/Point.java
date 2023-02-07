package me.whiteship.chapter02.item10;

import java.util.ArrayList;
import java.util.List;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//
//        if (!(o instanceof Point)) {
//            return false;
//        }
//
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        List<Point> points = new ArrayList<>();
        points.add(point);
        System.out.println(points.contains(new Point(1,2)));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
             return false;
        }

        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}
