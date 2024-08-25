package Assignment2;

public class Question25 {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 23, 56, 89, 12, 67};

        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
