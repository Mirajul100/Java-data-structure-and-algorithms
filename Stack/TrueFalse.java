package Stack;

import java.util.Scanner;
import java.util.Stack;

public class TrueFalse {
    public boolean trueFalse(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                            (c == '}' && top == '{') ||
                            (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the braked : ");
        string = input.nextLine();
        TrueFalse tf = new TrueFalse();
        System.out.println(tf.trueFalse(string));

    }
}
