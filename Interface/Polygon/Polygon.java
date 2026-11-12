package Interface.Polygon;

/**
 * Polygon
 */
public interface Polygon extends AreaInterface, Perimeter{
    public void draw();

    //use default to create a body for interface
    default void info(){
        System.out.println("Info from polygon");
    }

    //error
    // void info(){

    // }
}
