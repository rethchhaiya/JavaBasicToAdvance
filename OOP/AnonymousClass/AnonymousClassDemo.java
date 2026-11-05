package OOP.AnonymousClass;

public class AnonymousClassDemo{

    //anonymous class 
    static Shape sh = new Shape(){
        public void draw(){
            System.out.println("Drawing from static class");
        };
    };
    public static void main(String[] args) {
        // Ractangle rac = new Ractangle();
        // rac.draw();

        sh.draw();
    }
}
