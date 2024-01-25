import java.util.Scanner;

public class tasksheet_1_1_6 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find and print the largest number
        findLargestNumber(num1, num2, num3);

        // Close the scanner
        scanner.close();
    }

    // Function to find and print the largest number among three numbers
    public static void findLargestNumber(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            int max = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number is: " + max);
        }
    }
}
