package chapter11;

public class ShapeTester {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(9, 8);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
