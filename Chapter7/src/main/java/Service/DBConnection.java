package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final String userName = "root";
    private final String Password = "root";
    private final String dbNameAndHost = "localhost:8889/Chapter7";

    public Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://" + dbNameAndHost, userName, Password);
        return connection;
    }
}
