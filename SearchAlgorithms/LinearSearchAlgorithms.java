package SearchAlgorithms;

public class LinearSearchAlgorithms {

    public int linearSearch(int[] arr, int size, int value) {
        int i = 0;
        while (i <= size) {
            if (arr[i] == value) {
                return i + 1;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearchAlgorithms lsa = new LinearSearchAlgorithms();
        int[] array = { 20, 30, 4, 5, 6, 7, 10 };
        int n = array.length - 1;
        int f = lsa.linearSearch(array, n, 10);
        if (f == -1) {
            System.out.println("value not founded ");
        } else {
            System.out.println("value founded at index : " + f);
        }
    }
}
