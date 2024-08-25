package Assignment2;

public class Question22 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int searchElement = 30;

        boolean found = searchInArray(numbers, searchElement);

        if (found) {
            System.out.println("Element " + searchElement + " is present in the array.");
        } else {
            System.out.println("Element " + searchElement + " is not present in the array.");
        }
    }
    public static boolean searchInArray(int[] array, int element) {
        for (int value : array) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }
}
