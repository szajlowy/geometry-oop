package Figures;

public class Line {
    public Point p1;
    public Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        double xPow = Math.pow(this.p2.x - this.p1.x, 2);
        double yPow = Math.pow(this.p2.y - this.p1.y, 2);
        double xyPowSum = xPow + yPow;
        return Math.sqrt(xyPowSum);
    }
}
