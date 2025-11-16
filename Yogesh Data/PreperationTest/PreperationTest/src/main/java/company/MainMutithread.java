package company;


interface First {
    // default method
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}

interface Second1 {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}
public class MainMutithread implements First, Second {

    public static void main(String[] args) {
        MainMutithread e = new MainMutithread();
        e.show();
    }

    @Override
    public void show() {
        First.super.show();
        Second.super.show();
    }
}
