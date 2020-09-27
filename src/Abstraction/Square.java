package Abstraction;

public class Square extends Shapes{

    public double side;

    public Square(double side){
        if(side <= 0){
            throw new RuntimeException("cannot be negative");
        }

        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea(){
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter(){
        return Math.pow(4,side);
    }




}
