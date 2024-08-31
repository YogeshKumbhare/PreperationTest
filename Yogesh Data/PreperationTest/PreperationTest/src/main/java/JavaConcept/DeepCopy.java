package JavaConcept;

/* We can use Java inbuilt Deque as a double
ended queue to store the cache keys, with
the descending time of reference from front
to back and a set container to check presence
of a key. But remove a key from the Deque using
remove(), it takes O(N) time. This can be
optimized by storing a reference (iterator) to
each key in a hash map. */

import java.util.HashMap;
import java.util.Iterator;

public final class DeepCopy {

    // fields of the FinalClassExample class
    private final int id;

    private final String name;

    private final HashMap<String, String> testMap;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Getter function for mutable objects

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    // Constructor method performing deep copy

    public DeepCopy(int i, String n, HashMap<String, String> hm) {
        System.out.println("Performing Deep Copy for Object initialization");

        // "this" keyword refers to the current object
        this.id = i;
        this.name = n;

        HashMap<String, String> tempMap = new HashMap<String, String>();
        String key;
        Iterator<String> it = hm.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tempMap.put(key, hm.get(key));
        }
        this.testMap = tempMap;
    }

    // Test the immutable class

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i = 10;

        DeepCopy ce = new DeepCopy(i, s, h1);

        // print the ce values
        System.out.println("ce id: " + ce.getId());
        System.out.println("ce name: " + ce.getName());
        System.out.println("ce testMap: " + ce.getTestMap());
        // change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        // print the values again
        System.out.println("ce id after local variable change: " + ce.getId());
        System.out.println("ce name after local variable change: " + ce.getName());
        System.out.println("ce testMap after local variable change: " + ce.getTestMap());

        HashMap<String, String> hmTest = ce.getTestMap();
        hmTest.put("2", "new");

        System.out.println("ce testMap after changing variable from getter methods: " + ce.getTestMap());

    }

}

