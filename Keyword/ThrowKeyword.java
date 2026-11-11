package Keyword;

public class ThrowKeyword {
    public static void main(String[] args) {
        int age = 17;
        if(age < 18){
            //unchecked exception
            throw new RuntimeException("Age under 18 is not able to vote");
        }
        System.out.println("Can vote");
    }
}
