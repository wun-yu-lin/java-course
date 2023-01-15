import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/winniedatabase","root", "password");
            System.out.println("JDBC connection success");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from video" );
            while (resultSet.next()){
                System.out.println(resultSet.getString("videoName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
