package LinkList;

import java.util.Scanner;

public class SinglyLinkList {

    private Node head = null;
    Scanner input = new Scanner(System.in);

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    public void InsertFirstLinkList() {
        int data;
        int a;
        do {
            System.out.print("Enter the value you need to insert first node : ");
            data = input.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

            System.out.print("If you insert a node than press 1 ot not to press ant key : ");
            a = input.nextInt();

        } while (a == 1);
    }

    public void PrintLinkList() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty !");
        } else {
            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void InsertLast() {
        int data;
        Node current = head;
        System.out.print("Enter the value to insert the last : ");
        data = input.nextInt();
        Node lNode = new Node(data);

        if (head == null) {
            System.out.println("Empty");
        } else {
            while (current.next != null) {
                current = current.next;
            }
            System.out.println("Last Inserted node value is : " + data);
            current.next = lNode;
            current = lNode;
        }
    }

    public void InsertLinListInAnyPosition() {
        int position, data, count = 1;
        Node current = head;
        System.out.print("Enter the position you need to insert node value : ");
        position = input.nextInt();
        System.out.print("Enter node value : ");
        data = input.nextInt();
        Node pNode = new Node(data);

        if (head == null) {
            head = pNode;
        } else if (position == 1) {
            pNode.next = head;
            head = pNode;
        } else {
            while (count < position - 1) {
                current = current.next;
                count += 1;
            }
            Node temp = current.next;
            pNode.next = temp;
            current.next = pNode;
        }
    }

    public Node DeleteFirst() {
        Node temp = head;
        if (head == null) {
            return head;
        } else {
            head = head.next;
            temp.next = null;
            return temp;
        }
    }

    public Node DeleteLast() {
        Node current = head;
        Node previous = head;
        if (head == null) {
            return head;
        } else {
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            current.next = null;
            return current;
        }
    }

    public Node DeletedInAnyPosition() {
        int count = 1, position;
        System.out.print("Enter the position you need to Delete node : ");
        position = input.nextInt();
        Node current = head;
        Node fDelete = head;
        if (head == null) {
            return head;
        } else if (position == 1) {
            head = head.next;
            fDelete.next = null;
            return fDelete;
        } else {
            while (count < position - 1) {
                current = current.next;
                count += 1;
            }
            Node pDelete = current.next;
            Node temp = current.next.next;
            current.next = temp;
            pDelete.next = null;
            return pDelete;
        }
    }

    public Node reverse() {
        Node current = head;
        Node temp = null;
        Node previous = null;
        if (head == null) {
            return head;
        } else {
            while (current != null) {
                temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            return previous;
        }
    }

    public void printR(Node previous) {
        Node pre = previous;
        if (previous == null) {
            return;
        } else {
            while (pre != null) {
                System.out.print(pre.data + " --> ");
                pre = pre.next;
            }
            System.out.println("null");
        }
    }

    public void scarce() {
        Node current = head;
        int value;
        int count = 0;
        System.out.print("Enter the value you need to scarce : ");
        value = input.nextInt();
        if (head == null) {
            return;
        } else {
            while (current != null) {
                if (current.data == value) {
                    System.out.println("Founded");
                    break;
                }
                current = current.next;
                count++;
            }
            System.out.println("Founded position is : " + (count + 1));
        }
    }
}