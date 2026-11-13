package Interface.FunctionalInterface;

public class FunctionalInterfaceDemo{
    public static void main(String[] args) {
        //FunctionalInterface is only have one Abstract Method
    
        //SAM = Single Abstract Method

        //interface
        AddTen addTen = new AddTenImplement();
        System.out.println(addTen.add(10));

        //AnonymousClass
        AddNumber addNumber = new AddNumber() {

            @Override
            public int add(int number) {
                return number + 10;
            }
            
        };

        int n = addNumber.add(10);
        System.out.println(n);
    
        //Lamda expression interface
        AddNumber addNumberLamda = (int a) -> a + 10;
        System.out.println(addNumberLamda.add(10));
        
    }

}
