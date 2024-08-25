package Assignment2.Question9;

public class BoxWt extends Box {
    double weight;

    BoxWt() {
        super();
        this.weight = 1.0;
    }

    BoxWt(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    BoxWt(BoxWt ob) {
        super(ob);
        this.weight = ob.weight;
    }

    void print_BoxWt() {
        System.out.println("Box dimensions: " + length + "x" + width + "x" + height);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        BoxWt box1 = new BoxWt();
        box1.print_BoxWt();

        BoxWt box2 = new BoxWt(2.5, 3.0, 4.5, 5.0);
        box2.print_BoxWt();

        BoxWt box3 = new BoxWt(box2);
        box3.print_BoxWt();
    }
}
