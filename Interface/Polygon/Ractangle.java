package Interface.Polygon;

//multiple implement   
                //implement AreaInterface, Perimeter it is the same
public class Ractangle implements Polygon{
    private double width;
    private double height;

    public Ractangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override 
    public double getArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Ractangle [width=" + width + ", height=" + height + ", Area=" + getArea() + "]";
    }

    @Override 
    public double getPerimeter(){
        
        return (width + height) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing");
    }
    
}
