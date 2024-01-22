import java.util.Scanner;

public class oddEvenSumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int sumEven = 0;
        int sumFlag =0;
        long productOdd = 1; 
        int productFlag =0;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
                sumFlag++;
            } else {
                productOdd *= numbers[i];
                productFlag++;
            }
        }

        System.out.println("\nThe entered elements: ");
        for(int i:numbers){
            System.out.print("|" + i + "| ");
        }

        if (sumFlag != 0){
            System.out.println("\n\nSum of even numbers: " + sumEven);
        } else {
            System.out.println("\n\nNo Even elements entered");
        }
        if (productFlag != 0){
            System.out.println("Product of odd numbers: " + productOdd + "\n\n");
        } else {
            System.out.println("No Odd elements entered\n\n");
        }

        scanner.close();
    }
}
