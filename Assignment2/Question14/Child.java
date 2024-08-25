package Assignment2.Question14;

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println("Display from Child");
    }

    void show() {
        System.out.println("Name in Child: " + name);
        System.out.println("Name in Parent: " + super.name);
        super.display();
        display();
    }
}
