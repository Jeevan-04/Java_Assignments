package Assignment1._6AUG;

import java.util.Scanner;

public class GreaterAmongTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Number 1 (or type 'exit' to quit): ");

            if (scanner.hasNextInt()) {
                int number1 = scanner.nextInt();

                System.out.print("Enter the Number 2: ");
                if (scanner.hasNextInt()) {
                    int number2 = scanner.nextInt();

                    if (number1 > number2) {
                        System.out.println(number1 + " is greater than " + number2);
                    } else if (number1 == number2) {
                        System.out.println(number1 + " is equal to " + number2);
                    } else {
                        System.out.println(number2 + " is greater than " + number1);
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
