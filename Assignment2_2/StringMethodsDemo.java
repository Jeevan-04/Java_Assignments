package Assignment2_2;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        System.out.println("Length: " + str.length());
        System.out.println("Char at index 4: " + str.charAt(4));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'o' from index 5: " + str.indexOf('o', 5));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Index of 'World' from index 7: " + str.indexOf("World", 7));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Concatenated with ' Java': " + str.concat(" Java"));
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("Compare to 'Hello, Java!': " + str.compareTo("Hello, Java!"));
        System.out.println("Compare toIgnoreCase 'hello, java!': " + str.compareToIgnoreCase("hello, java!"));
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Replaced 'World' with 'Java': " + str.replace('W', 'J'));
        System.out.println("To char array: " + java.util.Arrays.toString(str.toCharArray()));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        String[] parts = {"Hello", "World"};
        System.out.println("Joined with ', ': " + String.join(", ", parts));

        System.out.println("Bytes: " + java.util.Arrays.toString(str.getBytes()));

        char[] dest = new char[5];
        str.getChars(7, 12, dest, 0);
        System.out.println("Chars from index 7 to 12: " + java.util.Arrays.toString(dest));
    }
}

