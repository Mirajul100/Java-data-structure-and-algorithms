package SortingAlgorithms;

public class SelectionSort {

    public void selectionSort(int[] array, int n) {
        int min = 0;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] array = { 3, 4, 1, 2, 5, 7, 8, 10, 9, 6 };
        int n = array.length;
        ss.selectionSort(array, n);
        ss.print(array);
    }
}
