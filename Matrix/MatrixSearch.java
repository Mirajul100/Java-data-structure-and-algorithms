package Matrix;

public class MatrixSearch {

    public void search(int[][] matrix, int n, int key) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == key) {
                System.out.println("founded at : " + (i + 1) + "," + (j + 1));
                return;
            }
            if (matrix[i][j] != key && j > 0) {
                j--;
            } else {
                j = n - 1;
                i++;
            }
        }
        System.out.println("Not founded");
    }

    public static void main(String[] args) {
        MatrixSearch ms = new MatrixSearch();
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        ms.search(matrix, matrix.length, 7);
    }
}
