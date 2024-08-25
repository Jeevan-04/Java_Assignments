package Assignment1._10AUG;

import java.util.Scanner;

public class VowelConsonant2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        character = Character.toLowerCase(character);
        if ("aeiou".indexOf(character) != -1) {
            System.out.println(character + " is a vowel.");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println(character + " is not a letter.");
        }
        scanner.close();
    }
}
