package Array;

public class StoreReverseArray {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] reverseArray(int[] arr) {
        int n = arr.length - 1;
        int i = 0;
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        StoreReverseArray rarr = new StoreReverseArray();
        rarr.printArray(array);
        int[] result = rarr.reverseArray(array);
        rarr.printArray(result);

    }
}
