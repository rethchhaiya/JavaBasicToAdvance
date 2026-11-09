package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        
        try{
            int result = b / a;
            System.out.println(result);
        }catch(ArithmeticException exception){  
            System.out.println("Error : Can not divide by zero");
        }
    }
}
