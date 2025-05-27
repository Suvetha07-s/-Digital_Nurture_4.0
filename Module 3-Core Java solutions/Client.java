import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner scanner = new Scanner(System.in);

        String userInput;
        while (true) {
            System.out.print("Enter message: ");
            userInput = scanner.nextLine();
            out.println(userInput);
            System.out.println("Server replies: " + in.readLine());
            if ("bye".equalsIgnoreCase(userInput)) break;
        }

        scanner.close();
        in.close();
        out.close();
        socket.close();
    }
}
