package chapter11;

import com.sun.source.doctree.SystemPropertyTree;

public class ShapeTester {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(9, 8);
        Shape square = new Square(10);
        rectangle.print();
        square.print();
        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
