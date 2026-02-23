import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string for UC6: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>(); // FIFO
        Stack<Character> stack = new Stack<>();       // LIFO

        // 1. Enqueue and 2. Push characters
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue Operation
            stack.push(c); // Push Operation
        }

        // 3. Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            // Logical Comparison: matching FIFO output vs LIFO output
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: Palindrome confirmed using Stack and Queue.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }
}