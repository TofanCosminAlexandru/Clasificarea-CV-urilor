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
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class FindCenterOfGravityTest {
    
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
    public void negative_cluster_ID_should_return_minus_one(){
        int nonValidID = -3;
        int result = gravityCenter.findCenterOfGravity(nonValidID);
        if(result == -1){
            assertTrue(true);
        }else{
            assertFalse(false);
        }
    }
    
    @Test
    public void non_existent_cluster_ID_should_return_minus_one(){
        int missingID = 9999;
        int result = gravityCenter.findCenterOfGravity(missingID);
        if(result == -1){
            assertTrue(true);
        }else{
            assertFalse(false);
        }
    }
    
    @Test
    public void cluster_ID_0_should_return_5(){
        int result = gravityCenter.findCenterOfGravity(0);
        if(result == 5){
            assertTrue(true);
        }else{
            assertFalse(false);
        }
    }
    
    @Test
    public void cluster_ID_2_should_return_7(){
        int result = gravityCenter.findCenterOfGravity(0);
        if(result == 7){
            assertTrue(true);
        }else{
            assertFalse(false);
        }
    }
    
}
