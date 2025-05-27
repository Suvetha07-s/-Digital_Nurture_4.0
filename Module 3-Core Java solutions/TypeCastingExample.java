public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 10.75;
        int intValue = (int) doubleValue; // Explicit casting

        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);

        int anotherInt = 42;
        double anotherDouble = anotherInt; // Implicit casting

        System.out.println("Original int value: " + anotherInt);
        System.out.println("After casting to double: " + anotherDouble);
    }
}
