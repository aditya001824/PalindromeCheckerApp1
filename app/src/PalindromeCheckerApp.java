import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC5: Stack-Based Palindrome Checker ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use a Stack of Characters as the data structure
        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        // Key Concept: Push Operation inserts characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 2. Pop and compare
        // Key Concept: Reversal Logic - Stack naturally reverses order
        StringBuilder reversedString = new StringBuilder();

        // Key Concept: Pop Operation removes characters in reverse order
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // 3. Print result
        if (input.equalsIgnoreCase(reversedString.toString())) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}