import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nEnter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("\nEnter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width ;

        System.out.print("\nThe area of the rectangle is: " + area + "\n\n");

        scanner.close();
    }
}
