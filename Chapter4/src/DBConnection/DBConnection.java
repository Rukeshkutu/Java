package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.SQLException;

public class DBConnection {
    private final String userName = "root";
    private final String Password = "root";
    private final String dbNameAndHost = "localhost:8889/seventhsem";

    public Connection getConnection() throws SQLException{
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://"+dbNameAndHost, userName, Password);
        return connection;
    }
}
