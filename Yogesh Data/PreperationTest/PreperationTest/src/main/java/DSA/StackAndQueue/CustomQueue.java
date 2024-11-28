package DSA.StackAndQueue;

public class CustomQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int defaultSize) {
        this.data = new int[defaultSize];
    }

    boolean isFull() {
        return end == data.length - 1;
    }

    private boolean isEmpty() {
        return end == -1;
    }

    public boolean insertElement(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = item;
        return true;
    }

    public int removeElement() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];

        // shift the element from left to right

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i ];
        }

        end--;
        return removed;
    }


    public void dispay() {
        for(int i = 0; i < end; i++) {
            System.out.println( "i = " + data[i] + " " +  i);
        }
    }

}
