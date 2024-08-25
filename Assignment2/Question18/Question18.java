package Assignment2.Question18;

public class Question18 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Manager St", 80000, "Project Manager", 5);
        Developer developer = new Developer("Bob", "456 Developer Rd", 70000, "Software Developer", "Java");

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Job Title: " + manager.getJobTitle());
        System.out.println("Number of Subordinates: " + manager.getNumberOfSubordinates());
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println("Performance Report: " + manager.generatePerformanceReport());
        manager.manageProject();

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Address: " + developer.getAddress());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Job Title: " + developer.getJobTitle());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println("Performance Report: " + developer.generatePerformanceReport());
        developer.writeCode();
    }
}