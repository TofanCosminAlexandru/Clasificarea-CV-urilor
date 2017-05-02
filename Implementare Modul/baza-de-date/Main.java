package sgbd;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "alexleleu";
    private static final String PASS = "alexleleu";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
        String sql;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver ul nu a putut fi inregistrat!");
     
            System.exit(0);
        }

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            sql = "Select sysdate from dual";
            result = stmt.executeQuery(sql);
            
            while(result.next()){
                String sysdate = result.getString(1);
                System.out.println("Sysdate: " + sysdate);
            }
            
            result.close();
            stmt.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
