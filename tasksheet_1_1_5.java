public class tasksheet_1_1_5 {
    public static void main(String[] args) {

        String inputString = "radar";

        // Check if the input string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Use StringBuilder to create a reversed string
        StringBuilder reversedString = new StringBuilder(str).reverse();

        // Use the equals() method to compare the original and reversed strings
        return str.equals(reversedString.toString());
    }
}
