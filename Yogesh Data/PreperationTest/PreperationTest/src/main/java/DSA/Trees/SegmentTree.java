package DSA.Trees;

public class SegmentTree {

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
    }

    private Node buildTree(int[] arr, int i, int i1) {

        if (i > i1) {
            return null;
        }
        if (i == i1) {
            return new Node(i, i1);
        }
        int mid = (i + i1) / 2;
        Node node = new Node(i, i1);
        node.left = buildTree(arr, i, mid);
        node.right = buildTree(arr, mid + 1, i1);

        if (node.left != null && node.right != null) {
            node.data = node.left.data + node.right.data;
        }
        return node;
    }

    public void display(Node root) {
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        String str = "";
        if (node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + ", " + node.left.endInterval + "] and data: " + node.left.data + "<=";
        } else {
            str = str + "No left child";
        }

        //for current node
        str = str + "Interval=[" + node.startInterval + ", " + node.endInterval + "] and data: " + node.data + " <= ";

        if (node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + ", " + node.right.endInterval + "] and data: " + node.right.data + " => ";
        } else {
            str = str + "No right child";
        }

        System.out.println(str);
        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

}


