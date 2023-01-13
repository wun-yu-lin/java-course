import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.awt.*;
import java.sql.*;

public class Driver {
    private static Connection connection;
    public static void main(String[] args) throws SQLException {
        //main
        initializedDB();
        String price = JOptionPane.showInputDialog("Find a video by price, please input integer");
        String sql_statement = "select * from video where price= ? ;";
        PreparedStatement pps = connection.prepareStatement(sql_statement); //avoid sql injection
        pps.setString(1,price);
        try{
            ResultSet resultSet = pps.executeQuery();
            while (resultSet.next()){
                String videoName = resultSet.getString("videoName");
                JOptionPane.showMessageDialog(null, videoName);
            }
        } catch (SQLException e) {
            System.out.println("Search SQL is failed");
            throw new RuntimeException(e);
        } catch (HeadlessException e) {
            throw new RuntimeException(e);
        }


        closeDB();

    }

    public static void initializedDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/winniedatabase","root", "password");
            System.out.println("JDBC connection success");
//            String sql_statement = "select * from video";
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql_statement);
//            while (resultSet.next()){
//                System.out.println(resultSet.getString("videoName"));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void closeDB(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
