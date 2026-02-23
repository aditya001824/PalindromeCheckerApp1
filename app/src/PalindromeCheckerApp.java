import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Data Structure: Deque
        Deque<Character> deque = new ArrayDeque<>();

        // 1. Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        // 2. Remove first & last and 3. Compare until empty
        while (deque.size() > 1) {
            // Front and Rear Access enables direct comparison
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (Character.toLowerCase(front) != Character.toLowerCase(rear)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Result: " + (isPalindrome ? "Palindrome" : "Not a palindrome"));
    }
}