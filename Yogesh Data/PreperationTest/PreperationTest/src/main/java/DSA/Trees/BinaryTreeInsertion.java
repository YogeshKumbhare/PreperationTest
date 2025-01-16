package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node2 left;
    Node2 right;

    Node(int value) {
        this.value = value;
    }
}

public class BinaryTreeInsertion {

    // private Node root;
    public BinaryTreeInsertion() {

    }

    public static Node2 insert(Node2 node1, int key) {

        if (node1 == null) {
            return new Node2(key);
        }
// create queue level order traversing
        Queue<Node2> queue = new LinkedList<>();

        queue.add(node1);
        while (!queue.isEmpty()) {
            Node2 curr = queue.poll();
            if (curr.left == null) {
                curr.left = new Node2(key);
                break;
            } else {
                queue.add(curr.left);
            }
            if (curr.right == null) {
                curr.right = new Node2(key);
                break;
            } else {
                queue.add(curr.right);
            }
        }
        return node1;
    }


    static void inorder(Node2 node1) {
        if (node1 == null) {
            return;
        }
        inorder(node1.left);
        System.out.print(node1.data + " ");
        inorder(node1.right);
    }

    public static void main(String[] args) {
        Node2 node1 = new Node2(2);
        node1.left = new Node2(3);
        node1.right = new Node2(4);
        node1.left.left = new Node2(5);
        node1.left.right = new Node2(6);
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
        inorder(node1);
        System.out.println();

        int key = 3;
        node1 = delete(node1, key);
        System.out.print("Inorder traversal after deletion: ");
        inorder(node1);
        System.out.println();


    }

    private static Node2 delete(Node2 node1, int key) {

        Node2 lastNode1 = null;
        Node2 lastParent = null;

        if (node1 == null) {
            return null;
        }

        // Use a queue to perform BFS
        Queue<Node2> q = new LinkedList<>();
        q.add(node1);
        Node2 target = null;

        // Find the target node
        while (!q.isEmpty()) {
            Node2 curr = q.poll();

            if (curr.data == key) {
                target = curr;
                break;
            }
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        if (target == null) return node1;

        Queue<Node2> queue = new LinkedList<>();
        queue.add(node1);
        Queue<Node2> parentQueue = new LinkedList<>();
        parentQueue.add(null);


        while (!queue.isEmpty()) {
            Node2 curr = queue.poll();
            Node2 parent = parentQueue.poll();
            lastNode1 = curr;
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
                return node1;
            }
        }

        target.data = lastNode1.data;

        // deletetion from teh binary list

        if (lastParent != null) {

            if (lastParent.left == lastNode1) {
                lastParent.left = null;
            } else {
                lastParent.right = null;
            }

        } else {
            return null;
        }
        return node1;
    }

        private static boolean search (Node2 node1, int key){
            if (node1 == null) {
                return false;
            }
            if (node1.data == key) {
                return true;
            }
            return search(node1.left, key) || search(node1.right, key);
        }


    }
