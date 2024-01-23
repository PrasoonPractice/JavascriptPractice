import java.util.Scanner;

public class vowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (isVowel(inputChar)) {
            System.out.print("\n'" + inputChar + "' is a vowel.");
        } else {
            System.out.print("\n'" + inputChar + "' is not a vowel.\n\n");
        }

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        char lowercaseChar = Character.toLowerCase(ch);

        return lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i'
                || lowercaseChar == 'o' || lowercaseChar == 'u';
    }
}
