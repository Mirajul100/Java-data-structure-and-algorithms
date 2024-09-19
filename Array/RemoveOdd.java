package Array;

public class RemoveOdd {
    public int[] removeOdd(int[] array) {
        int n = array.length;
        int i = 0;
        int count = 0;
        while (i < n) {
            if (array[i] % 2 == 0) {
                count++;
            }
            i++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                result[index] = array[j];
                index++;
            }
        }

        return result;
    }

    public void printArray(int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            System.out.print(" " + arra[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveOdd rodd = new RemoveOdd();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        rodd.printArray(arr);
        rodd.printArray(rodd.removeOdd(arr));
    }
}
