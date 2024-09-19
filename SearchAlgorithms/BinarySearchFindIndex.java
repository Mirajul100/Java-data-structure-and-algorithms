package SearchAlgorithms;

public class BinarySearchFindIndex {
    public void index(int[] array, int n, int value) {
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2); // this condition use for not over flow tha array.
            if (array[mid] == value) {
                System.out.println("Index found at : " + (mid));
                break;
            }
            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (array[mid] != value) {
            System.out.println(value + " Value inserted at index : " + left);
        }
    }

    public static void main(String[] args) {
        BinarySearchFindIndex bs = new BinarySearchFindIndex();
        int[] array = { 2, 3, 5, 6, 7, 8, 9, 10 };
        int n = array.length;
        bs.index(array, n, 11);
    }
}