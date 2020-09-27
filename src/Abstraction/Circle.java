package Abstraction;

public class Circle extends Shapes{

    public double radius;

    public Circle(double radius){
        if(radius <= 0){
            throw new RuntimeException("cannot be negative or zero");
        }
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }


    @Override
    public double calculateArea() {
        return Math.pow(radius,2) *Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }
}
