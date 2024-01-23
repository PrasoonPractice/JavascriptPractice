import java.util.Scanner;

abstract class checkDigit {
    abstract void checkDigitOccurrence(long number, int digit);
}

class ConcreteDigitChecker extends checkDigit {
    @Override
    void checkDigitOccurrence(long number, int digit) {
        String numberStr = Long.toString(number);
        
        int occurrenceCount = 0;
        
        for (char c : numberStr.toCharArray()) {
            int currentDigit = Character.getNumericValue(c);
            
            if (currentDigit == digit) {
                occurrenceCount++;
            }
        }
        
        System.out.print("\nDigit " + digit + " occurs " + occurrenceCount + " times in the number " + number + "\n\n");
    }
}

public class digitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter a number: ");
        long number = scanner.nextLong();
        
        System.out.print("\nEnter a digit to check: ");
        int digit = Character.getNumericValue(scanner.next().charAt(0));
        
        ConcreteDigitChecker digitChecker = new ConcreteDigitChecker();
        
        digitChecker.checkDigitOccurrence(number, digit);
        
        scanner.close();
    }
}
