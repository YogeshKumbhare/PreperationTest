package one;


public class RingBufferImpl {

    int capacity = 0;
    int head = 0;
    int tail = -1;

    int size = 0;
    Object array[] ;

    RingBufferImpl ( int capacity){
        this.capacity=capacity;

        array = new Object[capacity];
    }


    void put(Object o) {

        int index = (tail + 1) % capacity;

        size++;

        if(size == capacity){
            System.out.println("capacity is full");
        }

        array[index] = o;

        // System.out.print(Arrays.asList( array[index]));
        tail++;
    }

    Object get(){

        if(size == 0 ){
            System.out.print("size is empty");

        }
        if(head != size){
            head = capacity;
        }

        int index = head / capacity ;

       //  System.out.print(index);
        Object e = array[index];

        head++;
        size--;
        return e;
    }



    public static void main(String[] args) {

        RingBufferImpl ringbufferimpl = new RingBufferImpl(2);

        ringbufferimpl.put(2);
        ringbufferimpl.put(3);
        ringbufferimpl.put(4);
        ringbufferimpl.put(5);
        System.out.println(ringbufferimpl.get());
        //System.out.println(ringbufferimpl.get());
    }
}
