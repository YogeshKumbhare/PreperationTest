package linkedlist;

public class Fluke {
    public static void main(String[] args) {
//
//       MyThread myThread = new MyThread();
//        Thread t1 =  new Thread(myThread);
//        t1.start();
//        Thread t2 =  new Thread(myThread);
//       t2.start();

//        7
//     3     9

     Node node = new Node(7);
        node.left = new Node(3);
        node.left.left = new Node(5);
        node.right = new Node(9);

        printNode(node);


    }

    private static void printNode(Node node) {


        while(node != null){
            int data = node.data;
            System.out.println(data);
            node = node.left;
        }

    }


    static class  Node {
        int data ;
        Node left , right;

      public Node(int data) {
          this.data = data;
      }


  }


  // Hellow llowhe

    //yog ogy

    //test estt

    // tset



    // yog goy  - not cyclic








}
