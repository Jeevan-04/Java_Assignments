package Assignment2.Question21;

class SemiCircle extends Shape {
    private double radius;


    public SemiCircle() {
        this.radius = 1.0; 
    }

    public SemiCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 0.5 * Math.PI * radius * radius;
    }

    @Override
    double calculateCircumference() {
        return Math.PI * radius + 2 * radius;
    }
}
