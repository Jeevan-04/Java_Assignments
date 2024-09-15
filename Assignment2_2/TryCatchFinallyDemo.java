package Assignment2_2;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("In try block.");
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("In catch block: " + e.getMessage());
        } finally {
            System.out.println("In finally block.");
        }
    }
}
