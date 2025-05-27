public class MethodOverloading {

    // Method with 1 int parameter
    static int add(int a) {
        return a + 10;
    }

    // Method with 2 int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with 2 double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("add(int): " + add(5));
        System.out.println("add(int, int): " + add(10, 20));
        System.out.println("add(double, double): " + add(2.5, 3.7));
    }
}
