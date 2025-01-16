package DSA.Trees;

    // Java code to find minimum value in BST
// using iteration
    class Node6 {
        int data;
        Node6 left, right;

        Node6(int val) {
            data = val;
            left = right = null;
        }
    }

    public class FindMinimumElementInBSTTree {

        public static int minValue(Node6 root) {

            // base case
            if (root == null) {
                return -1;
            }

            Node6 curr = root;

            // leftmost node is minimum, so move till
            // left is not null
            while (curr.left != null) {
                curr = curr.left;
            }

            // returning the data at the leftmost node
            return curr.data;
        }

        public static void main(String[] args) {

            // Representation of input binary search tree
            //        5
            //       / \
            //      4   6
            //     /     \
            //    3       7
            //   /
            //  1
            Node6 root = new Node6(5);
            root.left = new Node6(4);
            root.right = new Node6(6);
            root.left.left = new Node6(3);
            root.right.right = new Node6(7);
            root.left.left.left = new Node6(1);

            System.out.println(minValue(root));
        }
    }

