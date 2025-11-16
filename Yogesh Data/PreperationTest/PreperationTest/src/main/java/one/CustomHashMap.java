package one;

interface  CMap<KEY,VALUE> {

    void put(KEY k, VALUE v);
    void get(KEY k);
    int size();
    interface Entry<KEY, VALUE>{
        KEY getKey();
        VALUE getValue();
    }
}


class Entry<KEY, VALUE> implements  CMap.Entry<KEY, VALUE> {
    KEY k;
    VALUE v;
    Entry<KEY, VALUE> next;
    public Entry(KEY k, VALUE v, Entry next) {
        this.k = k;
        this.v = v;
        this.next = next;
    }
    public KEY getKey() {
        return k;
    }
    public VALUE getValue() {
        return v;
    }
}

    public class CustomHashMap {


        }




