package SortingAlgorithms;

public class BaubleSort {

    public void baubleSort(int[] array, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        BaubleSort bus = new BaubleSort();
        int array[] = { 2, 34, 6, 5, 7, 10, 1, 3 };
        int n = array.length;
        bus.baubleSort(array, n);
        bus.print(array);
    }
}
