package Assignment2;

public class Question16 {

    static class Figure {
        protected double dim1;
        protected double dim2;

        public Figure(double dim1, double dim2) {
            this.dim1 = dim1;
            this.dim2 = dim2;
        }

        public double area() {
            return 0;
        }
    }

    static class Rectangle extends Figure {

        public Rectangle(double length, double width) {
            super(length, width);
        }

        @Override
        public double area() {
            return dim1 * dim2;
        }
    }

    static class Triangle extends Figure {

        // Constructor
        public Triangle(double base, double height) {
            super(base, height);
        }

        @Override
        public double area() {
            return 0.5 * dim1 * dim2;
        }
    }

    public static void main(String[] args) {

        Figure fig;

        // Rectangle object
        fig = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + fig.area());

        // Triangle object
        fig = new Triangle(4, 6);
        System.out.println("Area of Triangle: " + fig.area());
    }
}
