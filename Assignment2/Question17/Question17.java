package Assignment2.Question17;

public class Question17 {
    public static void main(String[] args) {
        Figure circleFigure = new Circle(5);
        Draw circleDraw = (Draw) circleFigure;

        System.out.println("Circle:");
        System.out.println("Area: " + circleFigure.area());
        System.out.println("Perimeter: " + circleFigure.perimeter());
        circleDraw.draw_shape();

        Figure rectangleFigure = new Rectangle(4, 6);
        Draw rectangleDraw = (Draw) rectangleFigure;

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangleFigure.area());
        System.out.println("Perimeter: " + rectangleFigure.perimeter());
        rectangleDraw.draw_shape();
    }
}