import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\n\tEnter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("\tEnter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.print("\tEnter the time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\n\tSimple Interest: " + simpleInterest);
        System.out.println("\n");

        scanner.close();
    }
}
