import java.util.Scanner;

public class sumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = calculate(num1, num2);
        double average = calculate(Double.valueOf(num1), Double.valueOf(num2));

        System.out.print("\n\nSum: " + sum);
        System.out.print("\nAverage: " + average + "\n\n");

        scanner.close();
    }

    public static int calculate(int num1, int num2) {
        return num1 + num2;
    }

    public static double calculate(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}
