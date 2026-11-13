package Interface.UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        //uaary = 1 binary = 2
        UnaryOperator<String> toUppercase = text -> text.toUpperCase(); 
        
        System.out.println(toUppercase.apply("chhaiya"));

        UnaryOperator<Integer> power = n -> n * n;
        System.out.println(power.apply(4));
    }
}
