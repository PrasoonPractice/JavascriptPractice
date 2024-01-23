import java.util.Scanner;

public class checkTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("\nEnter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("\nEnter the length of side 3: ");
        double side3 = scanner.nextDouble();

        String triangleType = checkTriangleType(side1, side2, side3);

        System.out.print("\nThe triangle is: " + triangleType + "\n\n");

        scanner.close();
    }

    private static String checkTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
