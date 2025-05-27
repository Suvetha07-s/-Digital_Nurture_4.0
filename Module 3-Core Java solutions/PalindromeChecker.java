import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
