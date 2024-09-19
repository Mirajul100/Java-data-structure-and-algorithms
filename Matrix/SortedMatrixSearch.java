package Matrix;

public class SortedMatrixSearch {

    public void sortedMatrixSearch(int[][] matrix, int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.print("found at : " + (i + 1) + "," + (j + 1));
                return;
            }
            if (matrix[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("value not founded");
    }

    public static void main(String[] args) {
        SortedMatrixSearch sms = new SortedMatrixSearch();
        int[][] matrix = { { 10, 20, 30, 40 },
                { 11, 21, 31, 41 },
                { 15, 25, 35, 45 },
                { 17, 27, 37, 47 } };
        sms.sortedMatrixSearch(matrix, matrix.length, 40);
    }
}
