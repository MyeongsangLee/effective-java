package me.whiteship.chapter02.item14.composition;

public class NamePoint implements Comparable<NamePoint> {
    private final Point point;
    private final String name;

    public NamePoint(Point point, String name) {
        this.point = point;
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public int compareTo(NamePoint o) {
        int result = this.point.compareTo(o.point);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return 0;
    }
}
