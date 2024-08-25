package Assignment1._6AUG;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number (or type 'exit' to quit): ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number == 0) {
                    System.out.println("The entered number is ZERO");
                } else if (number > 0) {
                    System.out.println("The entered number " + number + " is a positive (+) number.");
                } else {
                    System.out.println("The entered number " + number + " is a negative (-) number.");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program...");
                    break;
                } else {
                    System.err.println("Invalid Input, Please Enter an Integer Value...");
                }
            }
        }
        scanner.close();
    }
}
