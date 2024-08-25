package Assignment2.Question18;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        // No-arg constructor
    }

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * getSalary();
    }

    @Override
    public String generatePerformanceReport() {
        return "Developer " + getName() + " has a Good performance rating.";
    }

    public void writeCode() {
        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage + ".");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}