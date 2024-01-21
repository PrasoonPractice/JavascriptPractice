import java.util.Scanner;

class daysConvertor {
    public static void convert(int total) {
        int years = total / 365;
        int remainingDays = total % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the total number of days: ");
        int totalDays = scanner.nextInt();

        daysConvertor.convert(totalDays);

        scanner.close();
    }
}
