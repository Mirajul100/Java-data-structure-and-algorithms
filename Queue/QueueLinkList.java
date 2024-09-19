package Queue;

import java.util.Scanner;

public class QueueLinkList {

    private Node rare;
    private Node front;

    static Scanner input = new Scanner(System.in);

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueLinkList() {
        this.front = null;
        this.rare = null;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    public void anQueue() {
        int data;
        System.out.print("Enter the value to insert the queue : ");
        data = input.nextInt();
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rare = newNode;
        } else {
            rare.next = newNode;
            rare = newNode;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("There are no queue !");
        } else {
            Node node = front;
            System.out.println("Dequeue data is : " + node.data);
            front = front.next;
        }
    }

    public void peekQueue() {
        if (isEmpty()) {
            System.out.println("There are no queue !");
        } else {
            System.out.println("peeked value is : " + front.data);
        }
    }

    public void printQueue() {
        Node temp = front;
        if (isEmpty()) {
            System.out.println("There are no queue !");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "--");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLinkList qll = new QueueLinkList();
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
                    qll.anQueue();
                    break;
                case 2:
                    qll.deQueue();
                    break;
                case 3:
                    qll.peekQueue();
                    break;
                case 4:
                    qll.printQueue();
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
