package DSA.StackAndQueue;

public class DynamicQueueMain {

    public static void main(String[] args) throws Exception {



        CircularQueue queue =  new CircularQueue(10);

        queue.insert( 34);
        queue.insert(45);
        queue.insert(2);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
          }
}
