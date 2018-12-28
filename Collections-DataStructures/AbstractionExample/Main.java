import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("purple", 5, 2);
        Circle c = new Circle("blue", 4);
        //Shape s = new Shape("red");
        Shape s = new Rectangle("red", 9, 8);
        System.out.println("Shape Area " + s.getArea());
        System.out.println(s.draw());

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Circle Area: " + c.getArea());

        System.out.println(r.draw());
        System.out.println(c.draw());
    }
}