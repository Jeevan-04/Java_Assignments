package Assignment2_2;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            try {
                System.out.println("Accessing element at index 5: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: ArrayIndexOutOfBoundsException: " + e.getMessage());
            }

            String text = "Hello";
            try {
                System.out.println("Character at index 10: " + text.charAt(10));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Inner catch: StringIndexOutOfBoundsException: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch: Exception: " + e.getMessage());
        }
    }
}

