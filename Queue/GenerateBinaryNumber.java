package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumber {

    public String[] generateBinaryNumber(int n) {
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i = 0; i < result.length; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }

    public void printBinaryNumber(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = input.nextInt();
        GenerateBinaryNumber gb = new GenerateBinaryNumber();
        String[] arr = gb.generateBinaryNumber(n);
        gb.printBinaryNumber(arr);
    }
}
