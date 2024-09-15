package Assignment2_2;
// Assertions in Java are used to verify assumptions made by the program. 
// They are a debugging aid that can be enabled or disabled at runtime. 
// Assertions help identify bugs by evaluating boolean expressions and throwing 
// an AssertionError if the expression evaluates to false. They are typically used 
// during development and testing to ensure that the program's internal logic is correct.
//assert expression;
// assert expression : message;

public class AssertionDemo {
    public static void main(String[] args) {
        int value = -10;

        // Assertion will be enabled if you run the JVM with the -ea flag
        assert value >= 0 : "Value must be non-negative";

        System.out.println("Value is " + value);
    }
}
//java -ea AssertionDemo