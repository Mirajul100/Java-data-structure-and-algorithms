package Array;

public class Move0ToLast {
    public int[] move0(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
            i++;
        }
        return arr;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Move0ToLast move = new Move0ToLast();
        int[] array = { 1, 0, 0, 2, 3, 4, 5, 0, 6, 0, 0 };
        move.printArray(array);
        move.printArray(move.move0(array));
    }
}
