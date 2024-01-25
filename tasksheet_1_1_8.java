public class tasksheet_1_1_8 {
    public static void main(String[] args) {
        int[] nums = {10, 15, 55};

        System.out.print("Cumulative Sums: ");
        calculateCumulativeSums(nums);
    }

    // Integer variable arguments method to calculate cumulative sums
    public static void calculateCumulativeSums(int... numbers) {
        int sum = 0;
        
        for (int val : numbers) {
            sum += val;
            System.out.println(sum + " ");
        }
        System.out.println();
    }
}
