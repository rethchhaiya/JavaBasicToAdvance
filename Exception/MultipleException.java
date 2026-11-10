package Exception;

public class MultipleException {
    public static void main(String[] args) {
        String[] names = {"Yaya", "Mama", "Haha"};
        
        
        /*
        # Method 1
            - to catch muiltiple exception we can use
            catch after catch after catch base on
            how many exception we got.
        # Method 2
            - using ( | ) in one catch block example
            (excetion a | exception b)  
        
        # Method 3
            - catch base exception using built-in Exception keyword
            Example  (Exception e).
        
        */
        
        try {
            //this is uncheck exception
            String name = names[3];
            int result = 40/0;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
            exception.printStackTrace();
            //this is called base exception
        } catch(Exception e){
            e.printStackTrace();;
        }
    }
}
