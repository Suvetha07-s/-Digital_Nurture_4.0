import java.sql.*;

public class BasicJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:test.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connection established.");

            String sql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT)";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(sql);
            }

            sql = "SELECT * FROM students";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
