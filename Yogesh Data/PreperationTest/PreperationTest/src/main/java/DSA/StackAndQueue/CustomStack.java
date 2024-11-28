package DSA.StackAndQueue;

public class CustomStack {

   protected int[] data;

   private static final int DEFAULT_SIZE = 10;

   private int ptr = -1;

   public CustomStack() {
       this(DEFAULT_SIZE);
   }

    public CustomStack(int defaultSize) {
       this.data = new int[defaultSize];
    }

    public boolean push(int item){
      if(isFull()){
          System.out.println("Stack is full");
          return false;
      }
        ptr++;
        data[ptr] = item;
        return true;
    }



    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");

        }
//        int item = data[ptr];
//        ptr--;
        return data[ptr--];
    }
    boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty() {
       return ptr == -1;
   }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }


}
