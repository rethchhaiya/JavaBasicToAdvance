package Exception;


public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        
        String[] name = {"Yaya", "Mama"};

        try{
            int result =  b / a;
            System.out.println(result);
        }catch(ArithmeticException exception){  
            System.out.println("Error : Can not divide by zero");
            System.out.println("Message: " + exception.getMessage());
            //print the error line out
            // exception.printStackTrace();

        //finally block executed after both block above is executed
        }finally{
            //if the Exception happend in the finally block, finally block is never executed
            // System.out.println(name[2]);//Exection happen  here

            System.out.println("If this show that mean both block above has been executed");
        }
    }
}
