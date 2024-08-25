package Assignment2;

class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display from Child");
    }
}

public class Question13 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}