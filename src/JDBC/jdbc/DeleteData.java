package JDBC.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    private static final String DELETE_USERS_SQL= "delete from users where id = 3";

    public static void main(String [] arg) throws SQLException{
      DeleteData deleteData = new DeleteData();
      DeleteData.deleteRecord();
    }

    private static void deleteRecord() throws SQLException {
        System.out.println(DELETE_USERS_SQL);

        //Step 1: Establishing a connection.
        try(Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/jdbc_demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","!@aA12345");

            //step 2: create a statement using connection object.
            Statement statement = connection.createStatement()) {

            //step 3: Execute the query or update query
            int result = statement.executeUpdate(DELETE_USERS_SQL);
            System.out.println("Number of records affected: " + result);


        }catch (SQLException e){
            //print sql exception information
            printSQLException(e);
        }
        //step 4: try-with-resource statement will auto close the connection.

    }

    private static void printSQLException(SQLException ex) {
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
