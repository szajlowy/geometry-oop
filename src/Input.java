import Figures.Point;

public class Input {
    public static int choice(String[] choices) {
        while (true) {
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i + 1) + " - " + choices[i]);
            }
            System.out.print("Choice (1-" + choices.length + "): ");
            try {
                int choice = Main.scanner.nextInt();

                if (choice >= 1 && choice <= choices.length) {
                    Main.scanner.nextLine();
                    return choice;
                } else {
                    throw new Exception("The choice number is not in range");
                }
            } catch (Exception e) {
                System.out.println("\n\nEnter a valid number to choose an option\n");
                Main.scanner.nextLine();
            }
        }
    }

    public static Point[] getPoints(int qty) {
        Point[] points = new Point[qty];
        for (int i = 1; i <= qty; i++) {
            double x, y;
            while (true) {
                System.out.println("Enter the x of the " + i + " point");
                System.out.print("x" + i + " = ");
                try {
                    x = Main.scanner.nextDouble();
                    Main.scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("\n\nEnter a valid number\n");
                    Main.scanner.nextLine();
                }
            }
            while (true) {
                System.out.println("Enter the y of the " + i + " point");
                System.out.print("y" + i + " = ");
                try {
                    y = Main.scanner.nextDouble();
                    Main.scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("\n\nEnter a valid number\n");
                    Main.scanner.nextLine();
                }
            }
            points[i-1] = new Point(x, y);
        }
        return points;
    }

    public static double getDouble(String text) {
        while (true) {
            System.out.println(text);
            System.out.print("Number: ");
            try {
                double num = Main.scanner.nextDouble();
                Main.scanner.nextLine();
                return num;
            } catch (Exception e) {
                System.out.println("\n\nEnter a valid number\n");
                Main.scanner.nextLine();
            }
        }
    }
}
