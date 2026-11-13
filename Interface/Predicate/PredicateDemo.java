package Interface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //boolean function true and false
        Predicate<String> containA = contain -> contain.contains("a");
        System.out.println(containA.test("Chhaiya"));
    }
    
    
}
