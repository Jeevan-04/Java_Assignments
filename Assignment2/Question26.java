package Assignment2;

import java.util.Arrays;

public class Question26 {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62, 32};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(numbers);

        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
