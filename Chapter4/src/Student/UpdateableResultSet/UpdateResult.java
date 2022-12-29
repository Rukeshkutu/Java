package Student.UpdateableResultSet;

import DBConnection.DBConnection;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateResult {
    public static void main(String[] args){
        DBConnection dbConnection = new DBConnection();

        try {
            Connection connection = dbConnection.getConnection();
            String query = "SELECT * FROM students";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                if (resultSet.getInt("id") == 1) { //this if statement will make chanages in the first saved data
                    resultSet.updateString("name", "Suman");
                    resultSet.updateInt("age", 25);
                    resultSet.updateInt("batch", 2020);
                    resultSet.updateRow();
                }
            }

            resultSet.beforeFirst();

            System.out.println("Results after update");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("age"));
                System.out.println(resultSet.getString("batch"));
                System.out.println("---------------------------");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }
}

