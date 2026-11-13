package Interface.FunctionalInterface;

/**
 * Test
 */
public interface Test {

    void show();

    default void show2(String name){
        System.out.println("My name is " + name);
    }

    default int getNumber(){
        return 10;
    }
}
