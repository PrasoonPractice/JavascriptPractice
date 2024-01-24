import java.util.Scanner;

public class grossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nEnter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("\nEnter the allowances: ");
        double allowances = scanner.nextDouble();
        System.out.print("\nEnter the deductions: ");
        double deductions = scanner.nextDouble();

        System.out.print("\n\nThe gross salary is: " + (basicSalary + allowances - deductions) + "\n\n");

        scanner.close();
    }

    public static double calculateGrossSalary(double basicSalary, double allowances, double deductions) {
        return basicSalary + allowances - deductions;
    }
}
