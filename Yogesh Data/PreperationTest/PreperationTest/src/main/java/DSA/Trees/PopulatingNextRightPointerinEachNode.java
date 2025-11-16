package DSA.Trees;

class Node9 {
    int data;
    Node9 left;
    Node9 right;
    Node9 next;

    public Node9(int data) {
        this.data = data;
    }

    public Node9(int data, Node9 left, Node9 right, Node9 next) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}


public class PopulatingNextRightPointerinEachNode {

//     1
//2     3
//4  5  6  7

   public Node9 populatingNextRightPointerinEachNode(Node9 root) {
       if(root == null){
           return root;
       }
       Node9 leftMost = root;

       while(leftMost.next != null){
           Node9 currentNode = leftMost;
           while (currentNode != null){
               currentNode.left.next = currentNode.right;
               if(currentNode.next != null){
                    currentNode.right.next = currentNode.next.left;
               }
               currentNode = currentNode.next;
           }
           leftMost = leftMost.next;
       }
       return root;
   }

    public static void main(String[] args) {

    }


}
