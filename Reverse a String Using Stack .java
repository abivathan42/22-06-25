import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push all characters to the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop characters and build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed string: " + reversed.toString());
        input.close();
    }
}
