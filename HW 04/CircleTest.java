import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Point point1 = new Point((int) (Math.random() * 25) + 1, (int) (Math.random() * 25) + 1);
        Point point2 = new Point(0, 0);

        // Instantiate circles
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius for the first circle: ");
        int radius1 = scanner.nextInt();
        Circle circle1 = new Circle(point1, radius1);
        Circle circle2 = new Circle(point2, 5);

        // Summary of each Circle
        System.out.println("Circle 1: " + circle1.toString());
        System.out.println("Circle 2: " + circle2.toString());

        // Print distance between centers or average circumference
        if (circle1.equals(circle2)) {
            double distance = point1.distance(point2);
            System.out.println("Distance between centers: " + distance);
        } else {
            double averageCircumference = (circle1.circumference() + circle2.circumference()) / 2;
            System.out.println("Average Circumference: " + averageCircumference);
        }

        scanner.close();
    }
}
