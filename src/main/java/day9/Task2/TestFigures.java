package day9.Task2;

public class TestFigures {

    public static void main(String[] args) {
    Figure[] figures = {
            new Triangle("Red", 10, 20, 10),
            new Triangle("Green", 10, 20, 30),
            new Triangle("Red", 10, 20, 15),

            new Circle(4, "Red"),
            new Circle(10, "Red"),
            new Circle(5, "Blue"),

            new Rectangle("Red", 5, 10),
            new Rectangle("Green", 40, 15)


        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum = sum + figure.perimeter();
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum2 = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum2 = sum2 + figure.area();
        }
        return sum2;
    }

}
abstract class Figure{
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();
}
class Circle extends Figure {
    private double r;
    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * (r * r);
    }

    @Override
    public double perimeter() {
        return 2 * r * Math.PI;
    }
}
class Rectangle extends Figure{
    private double a; //ширина
    private  double b; //высота

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
class Triangle extends Figure{
    private double a; //стороны треугольника 3 шт
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
