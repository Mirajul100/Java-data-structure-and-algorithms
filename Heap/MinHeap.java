package Heap;

public class MinHeap {

    private Integer[] heap;
    int n;

    public MinHeap(int capacity) {
        heap = new Integer[capacity + 1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void insert(int x) {
        if (n == (heap.length - 1)) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 1; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void swim(int k) {
        while (k > 1 && heap[k] < heap[k / 2]) {
            Integer temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    public int deleteMinHeap() {
        int min = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = null;
        if (n > 0 && (n == (heap.length - 1 / 4))) {
            resize(heap.length / 2);
        }

        return min;
    }

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && heap[j + 1] < heap[j]) {
                j++;
            }
            if (heap[k] <= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void printMinHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap(3);
        mh.insert(4);
        mh.insert(5);
        mh.insert(2);
        mh.insert(6);
        mh.insert(1);
        mh.insert(3);
        System.out.println(mh.size());
        mh.printMinHeap();
        System.out.println();
        System.out.println(mh.deleteMinHeap());
        mh.printMinHeap();
        System.out.println();
        System.out.println(mh.deleteMinHeap());
        mh.printMinHeap();
        System.out.println();
        System.out.println(mh.deleteMinHeap());
        mh.printMinHeap();
        System.out.println();
        System.out.println(mh.deleteMinHeap());
        mh.printMinHeap();
        System.out.println();
        System.out.println(mh.deleteMinHeap());
        mh.printMinHeap();
    }
}
