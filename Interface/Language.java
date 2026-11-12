package Interface;

public interface Language {

    //implicit = automatic we do not need to add public or abstract keyword
    //explicit = need to define public or abstract
    //we can do both of this syntax

    void greeting();
    public void introduce(String name);
    
    // this is constant
    int VERSION = 1; // public static final int VERSION = 1;
}
