import java.util.Scanner;

public class compareThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nEnter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("\nEnter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("\nThe largest number is: " + findLargestNumber(num1, num2, num3) + "\n\n");

        scanner.close();
    }

    public static int findLargestNumber(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }
}
