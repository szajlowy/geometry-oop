import java.util.Scanner;
import Figures.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        choice = Input.choice(new String[] {"Calculate rectangle's area", "Check if a point is inside/on a circle"});
        switch (choice) {
            case 1 -> {
                Point[] points = Input.getPoints(4);
                Rectangle rectangle = new Rectangle(points[0], points[1], points[2], points[3]);
                double rectangleArea = rectangle.getArea();
                System.out.println("The rectangle's area is: " + rectangleArea);
            }
            case 2 -> {
                System.out.println("--- CIRCLE DATA ---");
                Point circlePoint = Input.getPoints(1)[0];
                double circleRadius = Input.getDouble("Enter the radius");
                Circle circle = new Circle(circlePoint, circleRadius);
                System.out.println("--- POINT DATA ---");
                Point p = Input.getPoints(1)[0];
                if (circle.isPointInside(p)) {
                    System.out.println("The point is inside/on the circle");
                } else {
                    System.out.println("The point isn't inside/on the circle");
                }
            }
        }

        scanner.close();
    }
}