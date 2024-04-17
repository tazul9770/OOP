// this is Main class
public class AbstractDemo2 {
    public static void main(String[] args) {

        // creat objeect 2 child class
        double r = 4.0;
        Circle cr = new Circle(r);
        double side1 = 3.0, side2 = 4.0, side3 = 5.0;
        Triangle tr = new Triangle(side1, side2, side3);

        System.out.println("Radius of circle: " + r);
        System.out.println("Area of circle: " + cr.area());
        System.out.println("Perimeter of the circle: " + cr.perimeter());
        System.out.println("\nTriangle side: " + side1 +" " +side2 +" " +side3);
        System.out.println("Area of the triangle: " + tr.area());
        System.out.println("Perimeter of the triangle: " + tr.perimeter());
    }
}
// this is abstract class
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}
// this is child class who extends super class Shape
class Circle extends Shape {
    private double radius;
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    double perimeter() {
        return side1 + side2 + side3;
    }
}