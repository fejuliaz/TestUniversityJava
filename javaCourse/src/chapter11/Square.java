package chapter11;

public class Square extends Shape {

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square(double length) {
        setLength(length);
    }

    @Override
    double calculateArea() {
        return length * length;
    }
}