package Student.TransactionExample;

import DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction1 {
    public static void main(String[] args) throws SQLException{
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);//from this both the following student will not be stored as second student data won't be execute

        try{
            String insertQuery = "INSERT " + "INTO students(name, age, batch)" + "VALUES('Rabina', 33, 2011)";
            statement.execute(insertQuery);
            String malformedInsertQuery = "INSERTING " + "INTO students(name, age, batch)" + "values('Madhu', 22, 2233)";
            statement.execute(malformedInsertQuery);
            connection.commit();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
