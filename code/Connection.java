import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/Product";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Copybook2140";

    public static void main(String[] args) {
        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            if (connection != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make a connection.");
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
