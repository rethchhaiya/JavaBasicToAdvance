package Interface.Polygon;

public class PolygonApplication {
    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle(5, 2);
        // double area = ractangle.getArea();
        System.out.println(ractangle.getPerimeter());

        Triangle triangle = new Triangle(2, 3, 1);
        System.out.println(triangle.getPerimeter());
    }
}
