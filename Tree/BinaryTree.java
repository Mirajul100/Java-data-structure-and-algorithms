package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

    static Scanner input = new Scanner(System.in);

    private Node root;

    public class Node {
        private Node left;
        private Node right;
        private int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void createBinaryTree() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        if (root == null) {
            return;
        }
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void inOrderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node current = root;
        stack1.push(current);
        while (!stack1.isEmpty()) {
            current = stack1.pop();
            stack2.push(current);
            if (current.left != null) {
                stack1.push(current.left);
            }
            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        while (!stack2.isEmpty()) {
            Node temp = stack2.pop();
            System.out.print(temp.data + " ");
        }
    }

    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.println("Pre order");
        bt.createBinaryTree();
        bt.preOrder(bt.root);
        System.out.println();
        bt.preOrderIterative(bt.root);
        System.out.println("\nIn order");
        bt.inOrder(bt.root);
        System.out.println();
        bt.inOrderIterative(bt.root);
        System.out.println("\nPost order");
        bt.postOrder(bt.root);
        System.out.println();
        bt.postOrderIterative(bt.root);
        System.out.println("\nLevel order");
        bt.levelOrder(bt.root);
    }
}
