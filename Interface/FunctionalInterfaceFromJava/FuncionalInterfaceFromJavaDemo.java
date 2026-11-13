package Interface.FunctionalInterfaceFromJava;

import java.util.function.Function;

public class FuncionalInterfaceFromJavaDemo {
    public static void main(String[] args) {
                //input  output
        Function<String, Integer> getlength = new ToLength();
        int length = getlength.apply("Chhaiya");
        System.out.println(length);

        //==============================

        //Lamda expression 
        Function<String, Integer> getLength1 = name -> name.length();

        System.out.println(getLength1.apply("Solima"));

        //==============================

        //get the first letter
        Function<String, Character> getFirstLetter = text -> text.charAt(0);

        System.out.println(getFirstLetter.apply("Chhaiya"));

        //==============================

        Function<Integer, Integer> power = number -> number * number;

        System.out.println(power.apply(3));

    }
    //remember we need static to access static
    static class ToLength implements Function<String, Integer>{

        @Override
        public Integer apply(String t) {
            return t.length();
        }

    }

    /*error
    class ToLength implements Function<String, Integer>{

        @Override
        public Integer apply(String t) {
            return t.length();
        }

    }*/
}

