package DSA.Trees;


import static DSA.Trees.LinkedNode.insertBinaryTreeNode;
import static DSA.Trees.Node2.inOrder;

class LinkedNode {
    int data ;
    Node2 left;
    Node2 right;
    public LinkedNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static Node2 insertBinaryTreeNode(Node2 node1, int key) {
        if (node1 == null) {
            return new Node2(key);
        }
        if (key < node1.data) {
            node1.left = insertBinaryTreeNode(node1.left, key);
        } else {
            node1.right = insertBinaryTreeNode(node1.right, key);
        }
        return node1;
    }

    public static void inOrder(Node2 node1){
        if(node1 == null){
            return;
        }
        inOrder(node1.left);
        System.out.print(node1.data + " ");
        inOrder(node1.right);
    }
}

public class BinaryInsertionTree {

    public static void main(String[] args) {

        Node2 root = null;

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insertBinaryTreeNode(root, 50);
        root = insertBinaryTreeNode(root, 30);
        root = insertBinaryTreeNode(root, 20);
        root = insertBinaryTreeNode(root, 40);
        root = insertBinaryTreeNode(root, 70);
        root = insertBinaryTreeNode(root, 80);
        root = insertBinaryTreeNode(root, 60);


        inOrder(root);
    }



}
