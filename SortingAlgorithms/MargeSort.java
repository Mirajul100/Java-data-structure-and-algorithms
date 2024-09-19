package SortingAlgorithms;

public class MargeSort {

    public void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return; // base case
        }

        int mid = (start + ((end - start) / 2));
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        conquer(arr, start, mid, end);
    }

    public void conquer(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int k = 0;
        int index1 = start;
        int index2 = mid + 1;

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                temp[k++] = arr[index1++];
            } else {
                temp[k++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            temp[k++] = arr[index1++];
        }

        while (index2 <= end) {
            temp[k++] = arr[index2++];
        }
        int j = start;
        for (int i = 0; i < temp.length; i++) {
            arr[j] = temp[i];
            j++;
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        MargeSort ms = new MargeSort();
        int[] array = { 5, 3, 6, 7, 1, 2, 8, 9, 10 };
        int n = array.length;
        int start = 0;
        int end = n - 1;
        ms.divide(array, start, end);
        ms.printArray(array);
    }
}
