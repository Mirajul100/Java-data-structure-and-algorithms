package LinkList;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoublyLinkList {

    Scanner input = new Scanner(System.in);

    private Node head;
    private Node tail;

    public class Node {
        int data;
        Node next;
        Node pre;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    public DoublyLinkList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void insertFirst() {
        int data;
        int a;
        do {
            System.out.print("Enter the value to inserted first : ");
            data = input.nextInt();
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.pre = newNode;
                head = newNode;
            }
            System.out.print("press 1 insert or not to press 0 : ");
            a = input.nextInt();
        } while (a == 1);
    }

    public void printForward() {
        Node current = head;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void printBackward() {
        Node temp = tail;
        if (tail == null) {
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.pre;
            }
            System.out.println("null");
        }
    }

    public void insertLast() {
        int data;
        System.out.print("Enter the value you need to insert the last : ");
        data = input.nextInt();
        Node lNode = new Node(data);
        if (isEmpty()) {
            return;
        } else {
            tail.next = lNode;
            lNode.pre = tail;
            tail = lNode;
        }
    }

    public void insertAnyPosition() {
        int data;
        int count = 1;
        Node current = head;
        int position;
        System.out.print("Enter the value you need to insert any position : ");
        data = input.nextInt();
        System.out.print("Enter the position you need to insert the value : ");
        position = input.nextInt();
        Node anyNode = new Node(data);
        if (isEmpty()) {
            return;
        } else if (position == 1) {
            // This is inserted in first position
            anyNode.next = head;
            head.pre = anyNode;
            head = anyNode;
        } else {
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            Node temp = current.next;
            if (temp == null) {
                // This for inserted in last position
                current.next = anyNode;
                anyNode.pre = current;
                anyNode.next = temp;
                current = anyNode;
                tail = current;
            } else {
                // This is inserted in any position
                anyNode.next = temp;
                temp.pre = anyNode;
                current.next = anyNode;
                anyNode.pre = current;
                current = anyNode;
            }

        }
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (head == tail) {
            tail = null;
            return tail;
        } else {
            Node temp = head;
            head = head.next;
            temp.next.pre = null;
            temp.next = null;
            return temp;
        }
    }

    public Node deleteLast() {
        if (tail == null) {
            return tail;
        } else {
            Node lNode = tail;
            tail = tail.pre;
            lNode.pre.next = null;
            lNode.pre = null;
            return lNode;
        }
    }

    public Node deleteAnyPosition() {
        int position, count = 1;
        Node current = head;
        System.out.print("Enter the position you need to delete the node value : ");
        position = input.nextInt();
        if (head == null || tail == null) {
            return head;
        } else if (position == 1) {
            Node temp = head;
            head = head.next;
            temp.next.pre = null;
            temp.next = null;
            return temp;
        } else {
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            Node anyNode = current.next.next;
            if (anyNode != null) {
                Node tNode = current.next;
                tNode.next.pre = current;
                current.next = tNode.next;
                return tNode;
            } else {
                tail = tail.pre;
                Node Nnode = current.next;
                Nnode.pre.next = null;
                Nnode.pre = null;
                return Nnode;
            }
        }
    }

    public static void main(String[] args) {
        boolean temp;
        DoublyLinkList dll = new DoublyLinkList();
        dll.insertFirst();
        dll.printForward();
        dll.printBackward();
        System.out.println();

        dll.insertLast();
        dll.printForward();
        dll.printBackward();
        System.out.println();

        dll.insertAnyPosition();
        dll.printForward();
        dll.printBackward();

        System.out.println("\nDeleted first element is : " + dll.deleteFirst().data);
        dll.printForward();
        dll.printBackward();

        System.out.println("\nDeleted last element is : " + dll.deleteLast().data);
        dll.printForward();
        dll.printBackward();

        System.out.println("\nDelete any position element : " + dll.deleteAnyPosition().data);
        dll.printForward();
        dll.printBackward();

        temp = dll.isEmpty();
        System.out.println(temp);
    }
}
