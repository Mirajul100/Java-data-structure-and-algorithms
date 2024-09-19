package Array;

public class FindMissingValue {

    public int findValue(int[] array) {
        int n = array.length + 1;
        int sum = n * (n + 1) / 2;
        int i = 0;
        while (i < array.length) {
            sum = sum - array[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        FindMissingValue find = new FindMissingValue();
        result = find.findValue(arr);
        System.out.println("Missing number is : " + result);
    }
}
