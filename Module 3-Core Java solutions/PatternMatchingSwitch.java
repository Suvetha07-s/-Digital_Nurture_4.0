public class PatternMatchingSwitch {
    public static void identifyObject(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case null -> System.out.println("It's null");
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        identifyObject(42);
        identifyObject("hello");
        identifyObject(3.14);
        identifyObject(true);
        identifyObject(null);
    }
}
