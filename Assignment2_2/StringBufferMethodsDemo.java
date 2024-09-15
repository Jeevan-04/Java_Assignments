package Assignment2_2;

public class StringBufferMethodsDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, StringBuffer!");

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Char at index 7: " + sb.charAt(7));

        sb.delete(7, 20);
        System.out.println("After delete(7, 20): " + sb);

        sb.deleteCharAt(6);
        System.out.println("After deleteCharAt(6): " + sb);

        char[] dst = new char[10];
        sb.getChars(0, 5, dst, 0);
        System.out.println("Get chars (0, 5): " + java.util.Arrays.toString(dst));

        System.out.println("Index of 'String': " + sb.indexOf("String"));
        System.out.println("Index of 'String' from index 5: " + sb.indexOf("String", 5));

        System.out.println("Last index of 'Buffer': " + sb.lastIndexOf("Buffer"));
        System.out.println("Last index of 'Buffer' from index 10: " + sb.lastIndexOf("Buffer", 10));

        System.out.println("Length: " + sb.length());

        sb.replace(0, 5, "Hi");
        System.out.println("After replace(0, 5, 'Hi'): " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt(0, 'H'): " + sb);

        System.out.println("Substring from index 3: " + sb.substring(3));
        System.out.println("Substring from index 3 to 8: " + sb.substring(3, 8));

        System.out.println("ToString: " + sb.toString());
    }
}
