package Abstraction;

public class ShapeObjects {

    public static void main(String[] args) {

        //Shapes shape = new Shapes(); abstract cannot create object
        Square square = new Square(10);

        System.out.println(square.calculateArea());
        System.out.println(square.area);
        System.out.println(square.perimeter);
        System.out.println(square.calculatePerimeter());
        System.out.println(square);

        System.out.println("===============");

        Cube cube = new Cube(3);
        System.out.println(cube.area);
        System.out.println(cube.perimeter);
        System.out.println(cube.volume);
        System.out.println(cube);
        System.out.println(cube.side);

        System.out.println("=========");

        Circle circle = new Circle(3);
        System.out.println(circle.area);
        System.out.println(circle.perimeter);
        System.out.println(circle.volume); //since circle has not volume
        System.out.println(circle);


    }
}