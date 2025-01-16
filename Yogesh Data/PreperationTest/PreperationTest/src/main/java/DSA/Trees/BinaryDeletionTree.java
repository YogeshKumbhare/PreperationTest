package DSA.Trees;

class Node2 {
    int data ;
    Node2 left;
    Node2 right;
    public Node2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static Node2 searchNode(Node2 node, int key){

        if(node == null){
            return node;
        }

        if(node.data == key){
            return node;
        }

        if(key < node.data){
            return searchNode(node.left, key);
        }else{
            return searchNode(node.right, key);
        }


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

public class BinaryDeletionTree {

    public static void main(String[] args) {

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        Node2 root = new Node2(50);
        root.left = new Node2(30);
        root.right = new Node2(70);
        root.left.left = new Node2(20);
        root.left.right = new Node2(40);
        root.right.left = new Node2(60);
        root.right.right = new Node2(80);

        // Searching for keys in the BST
        System.out.println(Node2.searchNode(root, 19) != null
                ? "Found"
                : "Not Found");
        System.out.println(Node2.searchNode(root, 80) != null
                ? "Found"
                : "Not Found");    }



}
