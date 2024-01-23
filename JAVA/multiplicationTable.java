import java.util.Scanner;

interface TableGenerator {
    void generateTable(int number);
}

class table implements TableGenerator {
    @Override
    public void generateTable(int number) {
        System.out.print("\nMultiplication Table for " + number + ": \n");
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n" + number + " x " + i + " = " + (number * i));
        }
    }
}

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        
        table multiplicationTable = new table();
        multiplicationTable.generateTable(number);
        
        System.out.print("\n\n");

        scanner.close();
    }
}
