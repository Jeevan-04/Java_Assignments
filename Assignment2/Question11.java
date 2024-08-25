package Assignment2;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWt extends Box {
    double weight;

    BoxWt() {
        super();
        weight = 0;
    }

    BoxWt(double w, double h, double d, double wg) {
        super(w, h, d);
        weight = wg;
    }
}

class BoxColor extends BoxWt {
    String color;

    BoxColor() {
        super();
        color = "unknown";
    }

    BoxColor(double w, double h, double d, double wg, String c) {
        super(w, h, d, wg);
        color = c;
    }
}

public class Question11 {
    public static void main(String[] args) {
        BoxColor box = new BoxColor(5, 4, 3, 2.5, "Red");
        System.out.println("Volume: " + box.volume());
        System.out.println("Weight: " + box.weight);
        System.out.println("Color: " + box.color);
    }
}
