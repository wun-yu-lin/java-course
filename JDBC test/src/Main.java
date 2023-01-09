import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql_statement = "select * from video";
        try{
            Connection c = DriverManager.getConnection("jdbc::mysql://localhost:3306/winniedatabase","root", "password");
            System.out.print("Connecting to the database");
        } catch (SQLException e) {
            System.out.print("SQL exceotion error");
            throw new RuntimeException(e);

        }

    }
}