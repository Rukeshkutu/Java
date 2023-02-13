package Service;

import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    private DBConnection dbConnection = new DBConnection();
    public boolean insert(User user) throws SQLException {
        String query = "INSERT INTO users(name, email, password) values(?,?,?)";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getPassword());

        if(preparedStatement.executeUpdate() > 0){
            return true;
        }
        return false;

    }

    public User login(User user) throws SQLException{
        String query = "SELECT * FROM users where email=? and password=?";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2, user.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            return user;

        }
        return null;
    }
}
