package Assignment2;

public class Question8 {
    public double calculateArea(double side) {
        return side * side;
    }
    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            throw new IllegalArgumentException("For a circle, use the radius and set isCircle to true.");
        }
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Question8 geometry = new Question8();

        double squareArea = geometry.calculateArea(2);
        System.out.println("Area of the square: " + squareArea);

        double circleArea = geometry.calculateArea(5, true);
        System.out.println("Area of the circle: " + circleArea);

        double rectangleArea = geometry.calculateArea(2, 4);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}

