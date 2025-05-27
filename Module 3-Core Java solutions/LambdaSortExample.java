import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Cherry");
        System.out.println("Before sorting: " + fruits);

        Collections.sort(fruits, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("After sorting: " + fruits);
    }
}
