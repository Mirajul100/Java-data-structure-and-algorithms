package Tree;

public class FindMaxInBinaryTree {
    private Node root;

    public class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public FindMaxInBinaryTree() {
        this.root = null;
    }

    public void createTree() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        root = first;
        first.left = second;
        fifth.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }

        return result;
    }

    public static void main(String[] args) {
        FindMaxInBinaryTree max = new FindMaxInBinaryTree();
        max.createTree();
        int Max = max.findMax(max.root);
        System.out.println(Max);
    }
}
