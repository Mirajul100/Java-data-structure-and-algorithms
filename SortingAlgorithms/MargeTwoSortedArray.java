package SortingAlgorithms;

public class MargeTwoSortedArray {

    public int[] marge(int[] arr1, int[] arr2, int n, int m) {
        int[] result = new int[(n + m)];
        int i = 0, j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < n) {
            result[k] = arr1[i];
            k++;
            i++;
        }
        while (j < m) {
            result[k] = arr2[j];
            k++;
            j++;
        }

        return result;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        MargeTwoSortedArray ma = new MargeTwoSortedArray();
        InsertionSort is = new InsertionSort();
        int[] array1 = { 3, 4, 1, 2, 5, 7, 8, 10, 9, 6 };
        int[] array2 = { 2, 34, 6, 5, 7, 10, 1, 3 };

        int n = array1.length;
        int m = array2.length;

        is.insertionSort(array1, n);
        is.insertionSort(array2, m);

        is.print(array1);
        System.out.println();
        is.print(array2);
        System.out.println();

        int[] l = ma.marge(array1, array2, n, m);
        ma.print(l);

    }
}