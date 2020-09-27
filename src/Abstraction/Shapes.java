package Abstraction;

public abstract class Shapes {

    public double area;
    public double perimeter;
    public double volume;

    public abstract double calculateArea(); //without implementation
    public abstract double calculatePerimeter(); //without body

    @Override
    public String toString() {
        return "Shapes{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
