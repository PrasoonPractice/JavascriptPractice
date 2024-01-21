import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();

        checkEvenOdd(number);

        scanner.close();
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("\n" + number + " is even.\n");
        } else {
            System.out.println("\n" + number + " is odd.\n");
        }
    }
}
