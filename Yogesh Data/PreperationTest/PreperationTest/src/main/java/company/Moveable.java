package company;

public interface Moveable {

    default void default_Moveable(){
        System.out.println("default_Moveable");
    }
}
