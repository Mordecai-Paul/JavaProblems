package JDBC.jdbc;

import javax.xml.transform.Result;
import java.sql.*;

public class MySQLDriver {
    public static void main (String args []){
        //try-with resource statement to close resource properly.


        //1.get database connection.
        ///localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","!@aA12345")){

            //2.create statement.
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");


            //process result
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                String password = resultSet.getString("Password");

                //3. execute statement.
                System.out.println(
                        id+"," + name + "," + email +"," + country + ","+ password
                );
            }



        }catch (SQLException e){
            e.printStackTrace();

        }

    }
}
