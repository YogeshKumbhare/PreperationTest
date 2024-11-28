package DSA.Trees;

import java.util.Scanner;

public class BinaryTrees {

    public BinaryTrees() {

    }

    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
        System.out.println("Binary Tree created successfully");
    }

    public void populate(Node node, Scanner scanner) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left child of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right child of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees binaryTrees = new BinaryTrees();
        binaryTrees.populate(scanner);
        binaryTrees.prettyDisplay();
    }


    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}

