package linkedlist;


interface Map<KEY , VALUE>{
   Object get(KEY k);
   void put(KEY k, VALUE v);
}

// store map data in key and value pair
class Entry<KEY,VALUE> {
    KEY key;
    VALUE value;
    Entry<KEY, VALUE> next;

    Entry(KEY k, VALUE v) {
        this.key = k;
        this.value = v;
    }

    public VALUE getValue() {
        return value;
    }

    public void setValue(VALUE value) {
        this.value = value;
    }

    public KEY getKey() {
        return key;
    }
}

public class CustomeHashMap<KEY,VALUE> implements Map<KEY,VALUE>{
    private static final int SIZE = 16;
    private Object table[] = new Object[SIZE];

    // this method will return based on key of value;
    @Override
    public Object get(KEY k) {
        int hashvalue = k.hashCode() % SIZE; // calculate hash value
        Entry e = (Entry) table[hashvalue];
        while(e != null) {
            if(e.getKey().equals(k)) { // check the element with key equal with existing key
                return e.getValue(); /// will get only value based on key
            }
            e = e.next;
        }
        return null;
    }

    @Override
    public void put(KEY k, VALUE v) {
        int hash = k.hashCode() % SIZE;   // calculate hash value
        Entry e = (Entry)table[hash];

        if(e != null) {
            if(e.getKey().equals(k)) { // here if we adding duplicate value the old value will replace with new value.
                e.value = v;
            } else {
                while(e.next != null) {   // if new elemnt will comes it will store end of list
                    e = e.next;
                }
                Entry entry = new Entry(k, v);
                e.next = entry;
            }
        } else {
            Entry entry1 = new Entry(k, v);  /// when new element comes it will create new bucket size allocation
            table[hash] = entry1;
        }
    }

    public static void main(String[] args) {
        CustomeHashMap customeHashMap = new CustomeHashMap();
        customeHashMap.put("yoge", "bang");
        customeHashMap.put("sa", "mum");
        System.out.println(customeHashMap.get("sa"));
        System.out.println(customeHashMap.get("yoge"));
    }
}