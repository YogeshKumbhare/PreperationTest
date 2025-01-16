package DSA.Trees;


import static DSA.Trees.Node4.isBST;

class Node4 {
    int data;
    Node4 left;
    Node4 right;

    Node4(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


    private static boolean isBSTUtil(Node4 node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        }
        return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
    }

    public static boolean isBST(Node4 node) {
        return isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}

public class isValideBSTTree {
    public static void main(String[] args) {
        Node4 root = new Node4(4);
        root.left = new Node4(2);
        root.right = new Node4(5);
        root.left.left = new Node4(1);
        root.left.right = new Node4(3);

        if (isBST(root)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
