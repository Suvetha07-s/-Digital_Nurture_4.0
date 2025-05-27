public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;           // Multiplication first
        int result2 = (10 + 5) * 2;         // Parentheses first
        int result3 = 100 / 10 + 5 - 3 * 2; // Multiple operators

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("100 / 10 + 5 - 3 * 2 = " + result3);
    }
}
