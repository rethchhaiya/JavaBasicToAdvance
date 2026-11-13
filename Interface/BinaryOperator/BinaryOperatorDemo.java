package Interface.BinaryOperator;

import java.util.function.BiFunction;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        //             //input input    output
        BiFunction<String, Integer, Integer> lengthAndPower = (text, power) -> text.length() * (int)Math.pow(text.length(), power);
        System.out.println(lengthAndPower.apply("Dara", 3));
    }
}
