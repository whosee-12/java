public class tasksheet_1_1_8 {
    public static void main(String[] args) {
        int[] nums = {10, 15, 55};

        System.out.print("Cumulative Sums: ");
        calculateCumulativeSums(nums);
    }

    // Integer variable arguments method to calculate cumulative sums
    public static void calculateCumulativeSums(int... numbers) {
        int sum = 0;

        System.out.print("(");

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println(") = " + sum);
    }
}
