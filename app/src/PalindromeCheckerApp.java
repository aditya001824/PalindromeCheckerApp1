import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC3: Palindrome Check Using String Reverse ---");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // 1. Reverse string using loop
        String reversed = "";

        /* Key Concept: String Immutability
           In each iteration, a new String object is created because
           Strings in Java cannot be changed once created.
        */
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // String Concatenation (+)
        }

        // 2. Compare original and reversed
        /* Key Concept: equals() Method
           We use .equals() to compare the text content,
           not '==' which would compare memory addresses.
        */
        boolean isPalindrome = original.equalsIgnoreCase(reversed);

        // 3. Display result
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string IS NOT a palindrome.");
        }

        scanner.close();
    }
}