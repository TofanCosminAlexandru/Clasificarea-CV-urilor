/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class CenterOfGravity {
      private Cv cv1;
      private Cv cv2;
      private Classifier classify;
      public String findCenterOfGravity(int ClusterID) {
       String URL = "jdbc:oracle:thin:@localhost:1521:xe";
        String USER = "student";
        String PASS = "STUDENT";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        String sql;
        int min = 9999;
        int distance = 0;
        String name = null;
        String compare = null;
        String wantedName = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver-ul nu a putut fi inregistrat");
            System.exit(0);
        }

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);

            stmt = conn.createStatement();

            sql = "Select * from database where ClusterId = " + ClusterID;

            rs = stmt.executeQuery(sql);
            rs2 = stmt.executeQuery(sql);
            
           
            while (rs.next()) {
                name = rs.getString(1);
                distance = 0;
                while(rs2.next()){
                    compare = rs2.getString(1);
                    if(compare!=name)
                        distance = (int) (distance + classify.distance(cv1,cv2));
                    }
                if(min>distance){
                       min = distance;
                       wantedName = name;
                }
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
        }
    
}
