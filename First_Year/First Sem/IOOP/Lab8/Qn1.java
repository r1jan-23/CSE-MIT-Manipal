/*1. Create an abstract class Figure with an abstract method area and two integer variables 
that represent x and y dimensions. Create three more classes Rectangle, Triangle and 
Square that extend Figure and implement the area method appropriately. Illustrate 
how the method area can be computed at run time for Rectangle, Square and Triangle 
to achieve dynamic polymorphism. */
abstract class Figure {
    protected int x;
    protected int y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(int l, int b) {
        super(l, b);
    }

    double area() {
        return x * y;
    }
}

class Triangle extends Figure {
    Triangle(int b, int h) {
        super(b, h);
    }

    double area() {
        return 0.5 * x * y;
    }
}

class Square extends Figure {
    Square(int s) {
        super(s, s);
    }

    double area() {
        return x * x;
    }
}

public class Qn1 {
    public static void main(String[] args) {

        Figure f;

        f = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + f.area());

        f = new Triangle(8, 6);
        System.out.println("Triangle Area: " + f.area());

        f = new Square(7);
        System.out.println("Square Area: " + f.area());
    }
}
