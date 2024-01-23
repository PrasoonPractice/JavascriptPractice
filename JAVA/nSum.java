import java.util.Scanner;

public class nSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter the value of n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.print("\nSum of the first " + n + " numbers is: " + sum + "\n\n");
        
        scanner.close();
    }
}
