package Queue;

import java.util.Scanner;

public class QueueArray {
    static Scanner input = new Scanner(System.in);
    private int front = -1;
    private int rare = -1;
    static int n;
    private int[] array = new int[n];

    public boolean isFull() {
        if (rare == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (rare == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void anQueue() {
        int value;
        if (isFull()) {
            System.out.println("Queue is overflow !");
        } else if (rare == -1 && front == -1) {
            System.out.print("Enter the value you need to insert the queue : ");
            value = input.nextInt();
            front++;
            rare++;
            array[rare] = value;
        } else {
            System.out.print("Enter the value you need to insert the queue : ");
            value = input.nextInt();
            rare++;
            array[rare] = value;
        }
    }

    public void printQueue() {
        int i = front;
        if (isEmpty()) {
            System.out.println("Queue is underflow !");
        } else {
            while (i <= rare) {
                System.out.print(array[i] + " ");
                i++;
            }
            System.out.println();
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is underflow !");
        } else {
            System.out.println("Dequeue value is : " + array[front]);
            front++;
            if (front > rare) {
                front = rare = -1;
            }
        }
    }

    public void peekQueue() {
        if (isEmpty()) {
            System.out.println("Queue is underflow !");
        } else {
            System.out.println("Peeked value is : " + array[front]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the queue size : ");
        n = input.nextInt();
        QueueArray qarr = new QueueArray();
        int a;
        while (true) {
            System.out.println("Press 1 to anqueue");
            System.out.println("Press 2 to dequeue");
            System.out.println("Press 3 to peekqueue");
            System.out.println("Press 4 to printqueue");
            System.out.println("Press 5 to exit\n");
            System.out.print("Enter your choice : ");
            a = input.nextInt();
            switch (a) {
                case 1:
                    qarr.anQueue();
                    break;
                case 2:
                    qarr.deQueue();
                    break;
                case 3:
                    qarr.peekQueue();
                    break;
                case 4:
                    qarr.printQueue();
                    break;
                case 5:
                    System.exit(a);
                    break;
                default:
                    System.out.println("You entered wrong number !");
                    break;
            }
        }
    }
}
