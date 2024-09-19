package Heap;

// Bottom-up Reheapify Max Heap
public class MaxHeap {
    private Integer[] heap;
    private int n;

    public MaxHeap(int capacity) {
        heap = new Integer[capacity + 1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int value) {
        if (n == (heap.length - 1)) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = value;
        swim(n);
    }

    public void resize(int capacity) {
        Integer temp[] = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }

        heap = temp;
    }

    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k / 2];
            heap[k / 2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }

    // top - bottom reheapify Max Heap;

    public int deleteMaxHeap() {
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = null;
        if (n > 0 && (n == (heap.length - 1) / 4)) {
            resize(heap.length / 2);
        }

        return max;

    }

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && heap[j] < heap[j + 1]) {
                j++;
            }

            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void printMaxHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaxHeap mh = new MaxHeap(3);
        mh.insert(4);
        mh.insert(5);
        mh.insert(2);
        mh.insert(6);
        mh.insert(1);
        mh.insert(3);
        System.out.println(mh.size());
        mh.printMaxHeap();
        System.out.println();
        System.out.println(mh.deleteMaxHeap());
        mh.printMaxHeap();
        System.out.println();
        System.out.println(mh.deleteMaxHeap());
        mh.printMaxHeap();
        System.out.println();
        System.out.println(mh.deleteMaxHeap());
        mh.printMaxHeap();
        System.out.println();
        System.out.println(mh.deleteMaxHeap());
        mh.printMaxHeap();

    }
}

// answer

// 4
// 4 5
// 5 4 2
// 5 4 2 6
// 5 6 2 4
// 6 5 2 4 1
// 6 5 2 4 1 3
// 6 5 3 4 1 2
