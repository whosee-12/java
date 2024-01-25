import java.util.Scanner;

public class tasksheet_1_1_5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Use StringBuilder to create a reversed string
        StringBuilder reversedString = new StringBuilder(str).reverse();

        // Use the equals() method to compare the original and reversed strings
        return str.equals(reversedString.toString());
    }
}
