package Interface.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = text -> System.out.println(text);

        print.accept("Hii");
    }
}
