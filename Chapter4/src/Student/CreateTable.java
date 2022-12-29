package Student;

import DBConnection.DBConnection;

import java.sql.Statement;


public class CreateTable {

    private DBConnection dbConnection = new DBConnection();

    public boolean createTables() {

        String query = " CREATE TABLE IF NOT EXISTS students " +
                "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                "name VARCHAR(255) ," +
                "age INTEGER, " +
                "batch INTEGER, " +
                "PRIMARY KEY (id))";

        String query1 = "CREATE TABLE IF NOT EXISTS images" + //table created for images
                "(id INTEGER NOT NULL AUTO_INCREMENT," +
                "image BLOB, "+ //BOBB= binary large object
                " PRIMARY KEY (id))";//CLOB = Character large object: for text file
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            statement.execute(query);
            statement.execute(query1);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        CreateTable createTables = new CreateTable();
        System.out.println(createTables.createTables());
    }
}