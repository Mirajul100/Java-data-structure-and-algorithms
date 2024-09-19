package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        private Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private BinarySearchTree() {
        this.root = null;
    }

    public void createBinarySearchTree(int value) {
        root = createBinarySearchTree(root, value);
    }

    public Node createBinarySearchTree(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = createBinarySearchTree(root.left, value);
        } else {
            root.right = createBinarySearchTree(root.right, value);
        }

        return root;
    }

    public void inOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null) {
            return;
        }
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

    public void preOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        stack.push(temp);
        if (root == null) {
            return;
        }
        while (!stack.isEmpty()) {
            temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void postOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node temp = root;
        stack1.push(temp);
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);
            if (current.left != null) {
                stack1.push(current.left);
            }
            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        while (!stack2.isEmpty()) {
            Node print = stack2.pop();
            System.out.print(print.data + " ");
        }
    }

    public void levelOrderIterative(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Node temp = root;
        queue.offer(temp);
        if (root == null) {
            return;
        }
        while (!queue.isEmpty()) {
            temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.createBinarySearchTree(5);
        bst.createBinarySearchTree(2);
        bst.createBinarySearchTree(3);
        bst.createBinarySearchTree(4);
        bst.createBinarySearchTree(1);
        bst.createBinarySearchTree(6);
        bst.createBinarySearchTree(7);
        bst.createBinarySearchTree(8);
        bst.createBinarySearchTree(9);
        bst.createBinarySearchTree(10);

        System.out.println("in order");
        bst.inOrderIterative(bst.root);
        System.out.println();
        System.out.println("pre order");
        bst.preOrderIterative(bst.root);
        System.out.println();
        System.out.println("post order");
        bst.postOrderIterative();
        System.out.println();
        System.out.println("level order");
        bst.levelOrderIterative(bst.root);
        System.out.println();
        Node l = bst.search(bst.root, 11);
        if (l != null) {
            System.out.println("value founded ");
        } else {
            System.out.println("value not founded ");
        }
    }
}
