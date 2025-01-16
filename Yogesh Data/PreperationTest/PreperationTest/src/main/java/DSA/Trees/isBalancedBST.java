package DSA.Trees;


import static javax.swing.Spring.height;

class Node7{
    int data;
    Node7 left;
    Node7 right;
    Node7(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class isBalancedBST {
    Node7 root;
    public boolean balanced( Node7 node){
        if (node == null){
            return true;
        }
        int lh ;
        int rh;

        lh = height(node.left);
        rh = height(node.right);
        if (Math.abs(lh-rh) <= 1 && balanced(node.left) && balanced(node.right)){
            return true;
        }
        return false;
    }

    public int height(Node7 node) {

        if(node == null)
            return 0;

        return 1+ Math.max(height(node.left), height(node.right));

    }

    public static void main(String[] args) {
        isBalancedBST tree = new isBalancedBST();
        tree.root = new Node7(10);
        tree.root.left = new Node7(5);
        tree.root.right = new Node7(30);
        tree.root.right.left = new Node7(15);
        tree.root.right.right = new Node7(20);

        if (tree.balanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
