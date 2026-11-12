package Interface;

public class khmerLanguage implements Language{
    @Override 
    public void greeting(){
        System.out.println("Sur sdey");
    }

    @Override
    public void introduce(String name) {
        System.out.println("My name is " + name);
    }
    
}
