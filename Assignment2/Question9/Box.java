package Assignment2.Question9;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box ob) {
        this.length = ob.length;
        this.width = ob.width;
        this.height = ob.height;
    }

    double volume() {
        return length * width * height;
    }
}