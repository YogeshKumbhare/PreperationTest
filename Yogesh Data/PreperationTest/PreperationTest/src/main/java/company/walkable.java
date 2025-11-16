package company;

public interface walkable extends Moveable{

    default void default_walkable1(){
        System.out.println("default_walkable");
    }
}
