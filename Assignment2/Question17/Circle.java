package Assignment2.Question17;

public class Circle implements Figure, Draw {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void draw_shape() {
        System.out.println("Drawing a Circle");
    }
}