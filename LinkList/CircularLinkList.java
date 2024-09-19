package LinkList;

import java.util.Scanner;

public class CircularLinkList {
    Node last;

    Scanner input = new Scanner(System.in);

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    CircularLinkList() {
        this.last = null;
    }

    public void circularLinkList() {
        int data;
        int a;
        do {
            System.out.print("Enter the value you need to create node : ");
            data = input.nextInt();
            Node newNode = new Node(data);
            if (last == null) {
                last = newNode;
                last.next = last;
            } else {
                newNode.next = last.next;
                last.next = newNode;
                last = newNode;
            }
            System.out.print("press 1 to create node or not to 0 : ");
            a = input.nextInt();
        } while (a == 1);
    }

    public void print() {
        if (last == null) {
            return;
        } else {
            Node temp = last.next;
            while (temp != last) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print(temp.data + (" -- >\n"));
        }
    }

    public void insertFirst() {
        int data;
        System.out.print("Enter the value you need insert first node : ");
        data = input.nextInt();
        Node fNode = new Node(data);
        if (last == null) {
            last = fNode;
        } else {
            fNode.next = last.next;
            last.next = fNode;
        }
    }

    public Node deleteFirst() {
        if (last == null) {
            return last;
        } else {
            Node temp = last.next;
            last.next = temp.next;
            temp.next = null;
            return temp;
        }
    }

    public static void main(String[] args) {
        CircularLinkList cll = new CircularLinkList();
        cll.circularLinkList();
        cll.print();

        cll.insertFirst();
        cll.print();

        System.out.println("Deleted first node is : " + cll.deleteFirst().data);
        cll.print();

    }
}
