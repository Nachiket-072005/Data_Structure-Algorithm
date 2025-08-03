public class Find_Max_Min_In_BST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }

    static int findMin(Node root) {
        if (root == null) {
            System.out.println("root is null");
        }

        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    static int findMax(Node root) {
        if (root == null) {
            System.out.println("root is null");
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        System.out.println("min dataue is " + findMin(root));
        System.out.println("min dataue is " + findMax(root));

    }
}