package Stack;

import java.util.Scanner;

public class LinkListStack {
    private Node top;

    static Scanner input = new Scanner(System.in);

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public LinkListStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public void push() {
        int data;
        System.out.print("Enter the data you need to add stack : ");
        data = input.nextInt();
        Node psNode = new Node(data);
        if (isEmpty()) {
            top = psNode;
        } else {
            psNode.next = top;
            top = psNode;
            System.out.println("pushed element is : " + top.data);
        }
    }

    public void pop() {
        Node temp = top;
        if (isEmpty()) {
            System.out.println("There is no element in stack");
        } else {
            top = top.next;
            temp.next = null;
            System.out.println("Poped element is : " + temp.data);
        }
    }

    public void pick() {
        if (isEmpty()) {
            System.out.println("There is no element in stack");
        } else {
            System.out.println("Picked element is :" + top.data);
        }
    }

    public void stackPrint() {
        Node temp = top;
        if (isEmpty()) {
            System.out.println("There is no element in stack");
        } else {
            while (temp != null) {
                System.out.println("Element are : " + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkListStack lls = new LinkListStack();
        int a;
        while (true) {
            System.out.println("press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to pick");
            System.out.println("Press 4 to print");
            System.out.println("Press 5 to exit\n");
            System.out.print("Enter your choice : ");
            a = input.nextInt();
            switch (a) {
                case 1:
                    lls.push();
                    break;
                case 2:
                    lls.pop();
                    break;
                case 3:
                    lls.pick();
                    break;
                case 4:
                    lls.stackPrint();
                    break;
                case 5:
                    System.exit(a);
                    break;
                default:
                    System.out.println("You enter a wrong input !");
                    break;
            }

        }

    }
}
