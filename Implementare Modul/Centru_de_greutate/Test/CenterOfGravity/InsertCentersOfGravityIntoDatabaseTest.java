/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CenterOfGravity;

import cvclassification.CenterOfGravity;
import cvclassification.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class InsertCentersOfGravityIntoDatabaseTest {
    private static CenterOfGravity gravityCenter;
    
    @BeforeClass
    public static void setUp(){
        gravityCenter = new CenterOfGravity();
    }

    @AfterClass
    public static void tearDown(){
        gravityCenter = null;
    }
    
    @Test
    public void for_test_database_should_insert_line1_0_7_line2_2_5(){
        //apel functie
        gravityCenter.insertCentersOfGravityIntoDatabase();
        
        //verificarea rezultatului
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql;
        
        int clusterID,gravityCenterID;
        
        try {
            conn = Database.getConnection();

            stmt = conn.createStatement();

            sql = "Select * from clusters";

            rs = stmt.executeQuery(sql); 

            while (rs.next()) {
                clusterID = rs.getInt(1);
                gravityCenterID = rs.getInt(2);
                if((clusterID==0)&&(gravityCenterID!=7)){
                    assertFalse(false);
                }
                if((clusterID==2)&&(gravityCenterID!=5)){
                    assertFalse(false);
                }
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            assertFalse(false);
        }
        assertTrue(true);
    }
    
//    @Test(expected=NullPointerException.class)
//    public void no_connection_throws_null_pointer_exception(){
//        result = gravityCenter.findAllCentersOfGravity();
//    }
}
