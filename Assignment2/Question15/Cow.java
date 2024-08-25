package Assignment2.Question15;

public class Cow extends Animal {
    private String breed;

    public Cow() {
        super();
        this.breed = "Unknown";
    }

    public Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cow [breed=" + breed + "]";
    }
}