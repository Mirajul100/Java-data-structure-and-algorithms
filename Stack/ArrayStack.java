package Stack;

import java.util.Scanner;

public class ArrayStack {
    private int top = -1;
    static Scanner input = new Scanner(System.in);
    static int n;
    private int[] array = new int[n];

    private void push() {
        int data;
        if (isFull()) {
            System.out.println("Stack is full !");
        } else {
            System.out.print("Enter the value : ");
            data = input.nextInt();
            top++;
            array[top] = data;
        }
    }

    private void printArrayStack() {
        int i = top;
        if (isEmpty()) {
            System.out.println("Stack is underflow !");
        } else {
            while (i >= 0) {
                System.out.println("element are : " + array[i]);
                i--;
            }
        }
    }

    private void pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow !");
        } else {
            System.out.println("Poped element is : " + array[top]);
            top--;
        }
    }

    private void peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflow !");
        } else {
            System.out.println("peeked value is : " + array[top]);
        }
    }

    private boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        if (top == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the stack size : ");
        n = input.nextInt();
        ArrayStack arrs = new ArrayStack();
        int a;
        while (true) {
            System.out.println("press 1 to push");
            System.out.println("press 2 to pop");
            System.err.println("press 3 to peek");
            System.out.println("press 4 to print");
            System.out.println("press 5 to exit\n");
            System.out.print("Enter your choice : ");
            a = input.nextInt();
            switch (a) {
                case 1:
                    arrs.push();
                    break;
                case 2:
                    arrs.pop();
                    break;
                case 3:
                    arrs.peek();
                    break;
                case 4:
                    arrs.printArrayStack();
                    break;
                case 5:
                    System.exit(a);
                    break;
                default:
                    System.out.println("You entered wrong number !");
                    break;
            }
        }
    }
}
