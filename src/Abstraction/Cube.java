package Abstraction;

public class Cube extends Shapes implements Volume{

    public double side;

    public Cube(double side){
        if(side <= 0){
            throw new RuntimeException("cannot be zero");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2) * 6; //side*side*6
    }

    @Override
    public double calculatePerimeter() {
        return side * 4 * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3); //side*side*side





    }


}
