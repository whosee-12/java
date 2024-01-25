public class tasksheet_1_1_3 {
    public static void main(String[] args) {
        // Step 4: Create an int variable and name it check_number with an initial value of 10.
        int check_number = 10;

        // Step 5: Create a String variable and name it message.
        String message;

        // Step 6: Use check_number as a condition on how many loops the program can print.
        for (int i = 1; i <= check_number; i++) {
            // Step 7: Create a loop that will check and print each number if odd or even numbers.
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";

            // Step 8: The next line should print the message value.
            System.out.println(message);
        }
    }
}
