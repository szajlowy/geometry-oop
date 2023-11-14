package Figures;

public class Circle {
    public Point s;
    public double r;

    public Circle(Point s, double r) {
        this.s = s;
        this.r = r;
    }

    public boolean isPointInside(Point p) {
        double result = Math.pow((this.s.x - p.x), 2) + Math.pow((this.s.y - p.x), 2);
        double radiusPow = Math.pow(this.r, 2);
        return result <= radiusPow;
    }
}
