package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    static Scanner input = new Scanner(System.in);

    public char[] reverseStack() {
        Stack<Character> str = new Stack<>();
        String string;
        System.out.print("Enter the string : ");
        string = input.nextLine();
        char[] result = string.toCharArray();
        for (char c : result) {
            str.push(c);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = str.pop();
        }
        return result;
    }

    public void printStack(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ReverseStack rs = new ReverseStack();
        char[] a = rs.reverseStack();
        rs.printStack(a);
    }
}
