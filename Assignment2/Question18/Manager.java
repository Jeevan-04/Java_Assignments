package Assignment2.Question18;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager() {
        // No-arg constructor
    }

    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double calculateBonus() {
        return 0.15 * getSalary();
    }

    @Override
    public String generatePerformanceReport() {
        return "Manager " + getName() + " has an Excellent performance rating.";
    }

    public void manageProject() {
        System.out.println("Manager " + getName() + " is managing a project.");
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}