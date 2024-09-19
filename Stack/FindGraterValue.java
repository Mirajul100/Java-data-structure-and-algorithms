package Stack;

import java.util.Stack;

public class FindGraterValue {
    public int[] findGraterValue(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public void printStack(int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
    }

    public static void main(String[] args) {
        FindGraterValue fgv = new FindGraterValue();
        int[] array = { 3, 1, 4, 5, 3, 6, 7 };
        int[] a = fgv.findGraterValue(array);
        fgv.printStack(a);
    }
}
