package Assignment2.Question21;

public class Question21 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        SemiCircle semiCircle = new SemiCircle(5);

        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        System.out.println("\nSemiCircle:");
        System.out.println("Radius: " + semiCircle.getRadius());
        System.out.println("Area: " + semiCircle.calculateArea());
        System.out.println("Circumference: " + semiCircle.calculateCircumference());
    }
}
