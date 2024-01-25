class ArithmeticTask {
    public static void main(String[] args) {

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // result is now 2 (compound assignment for subtraction)
        System.out.println(result);

        result *= 2; // result is now 4 (compound assignment for multiplication)
        System.out.println(result);

        result /= 2; // result is now 2 (compound assignment for division)
        System.out.println(result);

        result += 8; // result is now 10 (compound assignment for addition)
        System.out.println(result);

        result %= 7; // result is now 3 (compound assignment for modulus)
        System.out.println(result);

    }
}
