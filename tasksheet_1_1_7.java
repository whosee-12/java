import java.util.Scanner;

public class tasksheet_1_1_7 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform and print the four basic arithmetic operations
        printAdditionResult(num1, num2);
        printSubtractionResult(num1, num2);
        printMultiplicationResult(num1, num2);
        printDivisionResult(num1, num2);

        // Close the scanner
        scanner.close();
    }

    // Method to perform addition and print the result
    public static void printAdditionResult(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }

    // Method to perform subtraction and print the result
    public static void printSubtractionResult(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }

    // Method to perform multiplication and print the result
    public static void printMultiplicationResult(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication Result: " + result);
    }

    // Method to perform division and print the result
    public static void printDivisionResult(int num1, int num2) {
        // Check for division by zero
        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
