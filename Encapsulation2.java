// Area and perimeter for circle
public class Encapsulation2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(7.0);
        double r = circle.getRadius();
        double a = circle.area();
        double p = circle.perimeter();

        System.out.println("Radius: " +r);
        System.out.println("Area: " +a);
        System.out.println("Perimeter: " +p);
    }
}
class Circle {
    private double radius;
    // Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Getter method
    public double getRadius() {
        return radius;
    }
    // calculate area 
    public double area() {
        return Math.PI*radius*radius;
    }
    // calculate perimeter 
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}