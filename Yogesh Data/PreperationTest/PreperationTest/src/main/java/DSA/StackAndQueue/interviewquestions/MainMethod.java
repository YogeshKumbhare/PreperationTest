package DSA.StackAndQueue.interviewquestions;

public class MainMethod {
    public static void main(String[] args) {

        QueueUsingStackRemoveEfficient queueUsingStackEfficient = new QueueUsingStackRemoveEfficient();

        queueUsingStackEfficient.add(12);
        queueUsingStackEfficient.add(13);
        queueUsingStackEfficient.add(14);
        queueUsingStackEfficient.add(7);
        queueUsingStackEfficient.Display();
        queueUsingStackEfficient.remove();
        queueUsingStackEfficient.Display();
        queueUsingStackEfficient.add(23);
        queueUsingStackEfficient.add(43);
        for (int i = 0; i < 10; i++) {
            queueUsingStackEfficient.add(43 + i);
        }
        queueUsingStackEfficient.Display();

        for (int i = 0; i < 10; i++) {
            queueUsingStackEfficient.remove();
        }
        queueUsingStackEfficient.Display();

    }

}
