package SearchAlgorithms;

public class BinarySearch {

    public void binarySearch(int arr[], int n, int value) {
        int left = 0;
        int right = n - 1;
        int mid = 0;
        int count = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (arr[mid] == value) {
                System.out.print("founded at index : " + (mid + 1));
                break;
            }
            if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            count++;
        }
        if (arr[mid] != value)

        {
            System.out.println("not founded");
        }
        System.out.println("\n" + count);
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = array.length;
        bs.binarySearch(array, n, 1);
    }
}
