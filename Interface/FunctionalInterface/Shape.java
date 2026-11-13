package Interface.FunctionalInterface;

/**
 * Shape
 */
@FunctionalInterface 
public interface Shape {

    //abstract method
    void draw();

    //error
    // void draw2();

    default void show1(){
        System.out.println("Interface");
    }

    default void show2(){
        System.out.println("Interface");
    }
    
    default void show3(){
        System.out.println("Interface");
    }
}
