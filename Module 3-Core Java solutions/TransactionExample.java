import java.sql.*;

public class TransactionExample {
    public static void transferMoney(Connection conn, int fromAccountId, int toAccountId, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);

            String debitSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql)) {
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                debitStmt.executeUpdate();
            }

            String creditSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            try (PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                creditStmt.executeUpdate();
            }

            conn.commit();
            System.out.println("Transfer successful.");
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transfer failed, rolled back.");
            e.printStackTrace();
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:test.db";
        try (Connection conn = DriverManager.getConnection(url)) {
            // Assume accounts table exists with id and balance columns
            transferMoney(conn, 1, 2, 100.0);
        }
    }
}
