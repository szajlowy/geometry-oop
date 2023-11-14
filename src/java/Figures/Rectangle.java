package Figures;

public class Rectangle {
    public Point p1;
    public Point p2;
    public Point p3;
    public Point p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double getArea() {
        Line line1 = new Line(this.p1, this.p2);
        Line line2 = new Line(this.p1, this.p3);
        return line1.getLength() * line2.getLength();
    }
}
