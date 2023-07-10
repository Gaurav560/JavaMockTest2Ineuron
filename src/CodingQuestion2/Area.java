package CodingQuestion2;

public class Area {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Triangle triangle=new Triangle();
        System.out.println("the area of circle is ::"+circle.calculateArea());
        System.out.println("the area of triangle is::"+triangle.calculateArea());
        System.out.println("the area of rectangle is ::"+rectangle.calculateArea());
    }
}

abstract class Shape{
    abstract double calculateArea();

}
class Triangle extends Shape{
int l=2;
    int b=5;

    @Override
    double calculateArea() {
        return 0.5*l*b;
    }

}

class Circle extends Shape{
    int r=2;

    @Override
    double calculateArea() {
        return 3.14*r*r;
    }

}
class Rectangle extends Shape{
    int l=2;
    int b=5;

    @Override
    double calculateArea() {
        return l*b;
    }

}

