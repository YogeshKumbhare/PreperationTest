package DSA.Heaps;

import java.util.ArrayList;

public class Heaps<T extends Comparable<T>>{

    private ArrayList<T> heap;

    public Heaps(){
        heap = new ArrayList<>();
    }

    private void swap ( int i, int j){

        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);

    }
    private int parent(int i){
        return (i-1)/2;
    }

    private int leftChild(int i){
        return 2 * i + 1;
    }

    private int rightChild(int i){
        return 2 * i + 2;
    }

    public void insert(T value) {
        heap.add(value);
        upheap(heap.size() - 1);
    }

    private void upheap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(heap.get(index).compareTo(heap.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!heap.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public T remove() throws Exception {
        if (heap.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = heap.get(0);

        T last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            downheap(0);
        }

        return temp;
    }
    private void downheap(int index) {
        int min = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < heap.size() && heap.get(min).compareTo(heap.get(left)) > 0) {
            min = left;
        }

        if(right < heap.size() && heap.get(min).compareTo(heap.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downheap(min);
        }
    }
}
