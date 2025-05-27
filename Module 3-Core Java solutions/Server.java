import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server listening on port 12345...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Client says: " + inputLine);
            out.println("Server received: " + inputLine);
            if ("bye".equalsIgnoreCase(inputLine)) break;
        }

        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
