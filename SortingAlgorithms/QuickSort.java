package SortingAlgorithms;

public class QuickSort {

    public int partition(int[] arr, int law, int high) {
        int pivot = arr[high];
        int i = law;
        int j = law;
        while (i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] array = { 3, 12, 1, 5, 4, 6, 7, 10, 2 };
        int n = array.length - 1;
        qs.sort(array, 0, n);
        qs.print(array);
    }
}
