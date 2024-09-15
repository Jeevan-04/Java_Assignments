package Assignment2_2;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);

            String text = "Hello";
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
