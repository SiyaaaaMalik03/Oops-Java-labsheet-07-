import shapes.Circle;
import shapes.Rectangle;

public class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.printf("Circle area = %.2f%n", c.area());
        System.out.println("Rectangle area = " + r.area());
    }
}