package Assignment2_2;

public class StringBuilderMethodsDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");


        sb.append(123);                
        sb.append(45.67);              
        sb.append('A');               
        sb.append(true);             
        sb.append(" World");           
        System.out.println("Append: " + sb);


        sb.insert(5, " Java");         
        sb.insert(10, 100);            
        sb.insert(14, 3.14);           
        sb.insert(19, 'B');           
        sb.insert(21, false);         
        System.out.println("Insert: " + sb);


        sb.insert(27, new char[] {' ', 'A', 'B', 'C'});
        System.out.println("Insert char[]: " + sb);


        sb.insert(32, new char[] {'X', 'Y', 'Z'}, 1, 2);
        System.out.println("Insert char[] with offset and length: " + sb);


        sb.insert(35, " - End");
        System.out.println("Insert CharSequence: " + sb);


        sb.insert(42, " [Part]", 1, 5);
        System.out.println("Insert CharSequence with start and end: " + sb);


        sb.insert(48, new Object() {
            @Override
            public String toString() {
                return "Object";
            }
        });
        System.out.println("Insert Object: " + sb);


        sb.replace(5, 10, " - Changed");
        System.out.println("Replace: " + sb);


        sb.delete(42, 48);
        System.out.println("Delete: " + sb);


        sb.reverse();
        System.out.println("Reverse: " + sb);


        System.out.println("Capacity: " + sb.capacity());


        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());


        System.out.println("Char at index 5: " + sb.charAt(5));


        System.out.println("Length: " + sb.length());


        System.out.println("Substring from index 5: " + sb.substring(5));


        System.out.println("Substring from index 5 to 15: " + sb.substring(5, 15));


        StringBuilder sb2 = new StringBuilder("Hello World - Changed");
        System.out.println("Compare to sb2: " + sb.compareTo(sb2));


        char[] dst = new char[10];
        sb.getChars(5, 15, dst, 0);
        System.out.println("Get chars from index 5 to 15: " + java.util.Arrays.toString(dst));


        sb.deleteCharAt(5);
        System.out.println("Delete char at index 5: " + sb);


        System.out.println("Last index of 'World': " + sb.lastIndexOf("World"));


        System.out.println("Last index of 'World' from index 30: " + sb.lastIndexOf("World", 30));

        System.out.println("Index of 'World': " + sb.indexOf("World"));

        System.out.println("Index of 'World' from index 20: " + sb.indexOf("World", 20));

        sb.setCharAt(5, 'X');
        System.out.println("Set char at index 5: " + sb);

        System.out.println("ToString: " + sb.toString());
    }
}