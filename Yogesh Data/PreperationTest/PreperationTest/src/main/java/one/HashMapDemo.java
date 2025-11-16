package one;
// Java program to illustrate
// HashMap drawbacks
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class HashMapDemo extends Thread
{
    static HashMap<Integer,String> l=new HashMap<Integer,String>();

    public void run()
    {

        try
        {
            Thread.sleep(1000);
            // Child thread trying to add
            // new element in the object
            l.remove(102);
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread going to add element");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        l.put(100,"A");
        l.put(101,"B");
        l.put(102,"C");
        HashMapDemo t=new HashMapDemo();
        t.start();

        for (Object o : l.entrySet())
        {
            System.out.println(o);
            Thread.sleep(1000);
        }
        System.out.println(l);
    }
}
