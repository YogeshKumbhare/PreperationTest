package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class BinaryTreeInsertion {

    // private Node root;
    public BinaryTreeInsertion() {

    }

    public static Node insert(Node node, int key) {

        if (node == null) {
            return new Node(key);
        }
// create queue level order traversing
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.left == null) {
                curr.left = new Node(key);
                break;
            } else {
                queue.add(curr.left);
            }
            if (curr.right == null) {
                curr.right = new Node(key);
                break;
            } else {
                queue.add(curr.right);
            }
        }
        return node;
    }


    static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(2);
        node.left = new Node(3);
        node.right = new Node(4);
        node.left.left = new Node(5);
        node.left.right = new Node(6);
        // insertion binary tree
//        System.out.print("Inorder traversal before insertion: ");
//        inorder(node);
//        System.out.println();
//
//        int key = 6;
//        node = insert(node, key);
//
//        System.out.print("Inorder traversal after insertion: ");
//        inorder(node);
//        System.out.println();

//        // searching binary tree
//        System.out.print("All nodes in binary tree: ");
//        inorder(node);
//        System.out.println();
//        int key = 9;
//        if (search(node, key)) {
//            System.out.println(key + " Found in Binary search tree ");
//        } else {
//            System.out.println(key + " Not Found in Binary search tree");
//        }

        //deletion binary search tree
        System.out.print("Inorder traversal before deletion: ");
        inorder(node);
        System.out.println();

        int key = 3;
        node = delete(node, key);
        System.out.print("Inorder traversal after deletion: ");
        inorder(node);
        System.out.println();


    }

    private static Node delete(Node node, int key) {

        Node lastNode = null;
        Node lastParent = null;

        if (node == null) {
            return null;
        }

        // Use a queue to perform BFS
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        Node target = null;

        // Find the target node
        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.value == key) {
                target = curr;
                break;
            }
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        if (target == null) return node;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Queue<Node> parentQueue = new LinkedList<>();
        parentQueue.add(null);


        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            Node parent = parentQueue.poll();
            lastNode = curr;
            lastParent = parent;

            if (curr.left != null) {
                queue.add(curr.left);
                parentQueue.add(curr);
            }

            if (curr.right != null) {
                queue.add(curr.right);
                parentQueue.add(curr);
            }

            if (target == null) {
                return node;
            }
        }

        target.value = lastNode.value;

        // deletetion from teh binary list

        if (lastParent != null) {

            if (lastParent.left == lastNode) {
                lastParent.left = null;
            } else {
                lastParent.right = null;
            }

        } else {
            return null;
        }
        return node;
    }

        private static boolean search (Node node,int key){
            if (node == null) {
                return false;
            }
            if (node.value == key) {
                return true;
            }
            return search(node.left, key) || search(node.right, key);
        }


    }
