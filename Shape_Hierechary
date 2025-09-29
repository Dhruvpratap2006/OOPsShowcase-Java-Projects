// Shape
abstract class Shape {

    abstract double area(); // abstract method implementation will be done in its sub or child class
    abstract double perimeter();

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

}

// circle
class Circle extends Shape {

    double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    @Override
    double area() {
        return 3.14 * rad * rad;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * rad;
    }
}

class Rectangle extends Shape {
    
    double length;
    double width;

    Rectangle(double length , double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

// Main class
public class Shape_Hierechary {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        circle.display();

    Shape rectangle = new Rectangle(2, 3);
          rectangle.display();
    }
    }
    





