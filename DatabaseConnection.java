
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {
        DatabaseConnection objdb = new DatabaseConnection();
        System.out.println(objdb.getConnection());
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://70.205.1.4:3307/Fresherscheck", "Trainee", "Tra1nee@123");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
