package Assignment2.Question15;

public class Animal {
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

    public Animal() {
        this.vegetarian = false;
        this.food = "Unknown";
        this.numOfLegs = 0;
    }

    public Animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return "Animal [vegetarian=" + vegetarian + ", food=" + food + ", numOfLegs=" + numOfLegs + "]";
    }
}