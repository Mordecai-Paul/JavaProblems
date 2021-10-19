package JDBC.jdbc.javaguides.net;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementExample {
     public static final String CREATE_TABLE_SQL =
             "create table persons(\r\n"
             + "id int(3) primary key,\r\n"
             + "name varchar(20),\r\n"
             + "email varchar(20),\r\n"
             +"country varchar(20),"
             +"password varchar(20)\r\n"
             +");";
     public static void main(String args[]) throws SQLException {
          CreateStatementExample createTableExample = new CreateStatementExample();

            createTableExample.createTable();
     }

     public void createTable() throws SQLException{
          System.out.println(CREATE_TABLE_SQL);

          try(
                  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","!@aA12345");


              //step 2: Create a statement using connection object.
              Statement statement = connection.createStatement()){

              //step 3: Execute the query or update query
              boolean result = statement.execute(CREATE_TABLE_SQL);

              System.out.println(result);

              }catch (SQLException e){
              //print SQL exception information.
              printSQLException(e);
          }

          //step 4: try-with-resource statement will auto close the connection.


     }

    private void printSQLException(SQLException ex) {
         for(Throwable e : ex){
             if(e instanceof SQLException){
                 System.err.println("Sql state:" + ((SQLException) e).getSQLState());
                 System.err.println("Error Code" + ((SQLException) e).getErrorCode());
                 System.err.println("Message" + e.getMessage());
                 Throwable t = ex.getCause();
                 while (t != null){
                     System.out.println("cause:" + t);
                     t = t.getCause();
                 }

             }


         }
    }

}
