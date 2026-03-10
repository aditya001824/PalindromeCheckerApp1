import java.util.Scanner;

/**
 * =====================================================
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * =====================================================
 *
 * Goal:
 * Ignore spaces and case while checking if a string
 * is a palindrome.
 *
 * Steps:
 * 1. Normalize the string (remove spaces, convert to lowercase)
 * 2. Check palindrome using two-pointer method
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = checkPalindrome(normalized);

        System.out.println("Is Palindrome?: " + result);

        scanner.close();
    }

    /**
     * Checks if a string is a palindrome
     */
    private static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}