package Array;

import java.util.Scanner;

public class Palindrome {

    public boolean palindrome(String str) {
        char[] array = str.toCharArray();
        int n = array.length - 1;
        int i = 0;
        while (i < n) {
            if (array[i] != array[n]) {
                return true;
            }
            i++;
            n--;
        }
        return false;
    }

    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        String string;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        string = input.nextLine();
        boolean result = pl.palindrome(string);

        if (result == true) {
            System.out.println("Not palindrome");
        } else {
            System.out.println("palindrome");
        }
    }
}
