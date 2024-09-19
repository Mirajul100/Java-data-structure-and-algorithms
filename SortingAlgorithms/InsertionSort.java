package SortingAlgorithms;

public class InsertionSort {

    public void insertionSort(int[] array, int n) {
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] array = { 3, 4, 1, 2, 5, 7, 8, 10, 9, 6 };
        int n = array.length;
        is.insertionSort(array, n);
        is.print(array);
    }
}
