import java.util.Scanner;

class converter {
    converter(int choice){
        switch (choice) {
            case 1:
                convertFahrenheitToCelsius();
                break;

            case 2:
                convertCelsiusToFahrenheit();
                break;

            default:
                System.out.print("\n\nInvalid choice\n\n");
        }

    }

    public static void convertFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.print("\nTemperature in Celsius: " + celsiusResult + "\n\n");
        scanner.close();
    }

    public static void convertCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
        System.out.print("\nTemperature in Fahrenheit: " + fahrenheitResult + "\n\n"); 
        scanner.close();
    }
}

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("\nEnter choice: ");
        int choice = scanner.nextInt();
        new converter(choice); 

        scanner.close();
    }
}
