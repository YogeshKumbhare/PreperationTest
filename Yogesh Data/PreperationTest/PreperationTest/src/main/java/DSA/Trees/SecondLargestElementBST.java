package DSA.Trees;

class Node8 {
    int data ;
    Node8 left;
    Node8 right;
    public Node8(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public  class SecondLargestElementBST {

    public void findsecondlargestElementWithReverseInOrder(Node8 root , int [] count , int [] result) {
        if (root == null || count[0] >= 2) {
            return ;
        }

        // traversing right first to check second largest element in BST
        findsecondlargestElementWithReverseInOrder(root.right, count, result);
        count[0]++;

        if (count[0] == 2) {
            result[0] = root.data;
            return ;
        }

        // traversing right left to check second largest element in BST
        findsecondlargestElementWithReverseInOrder(root.left, count, result);


    }


    public int reverseInOrder(Node8 node){

        int count[] = {0};
        int result[] = {-1};

        findsecondlargestElementWithReverseInOrder(node, count, result);

        return result[0];
    }


    public static void main(String[] args) {

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        Node8 root = new Node8(50);
        root.left = new Node8(30);
        root.right = new Node8(70);
        root.left.left = new Node8(20);
        root.left.right = new Node8(40);
        root.right.left = new Node8(60);
        root.right.right = new Node8(80);

        SecondLargestElementBST secondLargestElementBST = new SecondLargestElementBST();

        int reseverseSecondElement = secondLargestElementBST.reverseInOrder(root);

        System.out.println(reseverseSecondElement);

    }
}
