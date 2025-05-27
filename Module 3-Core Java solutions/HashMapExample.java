import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding entries
        System.out.println("Enter number of students to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID (Integer): ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            students.put(id, name);
        }

        // Retrieve name by ID
        System.out.print("Enter ID to retrieve name: ");
        int searchId = scanner.nextInt();
        String name = students.get(searchId);
        if (name != null) {
            System.out.println("Student name: " + name);
        } else {
            System.out.println("No student found with ID " + searchId);
        }
        scanner.close();
    }
}
