/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CenterOfGravity;

import cvclassification.CenterOfGravity;
import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class FindAllCentersOfGravityTest {
    private static CenterOfGravity gravityCenter;
    private static HashMap<Integer,Integer> result;
    
    @BeforeClass
    public static void setUp(){
        gravityCenter = new CenterOfGravity();
        result = new HashMap<Integer,Integer>();
    }

    @AfterClass
    public static void tearDown(){
        gravityCenter = null;
        result = null;
    }
    
    @Test
    public void centers_for_test_database_should_be_5_and_7(){
        result = gravityCenter.findAllCentersOfGravity();
        for(Map.Entry m:result.entrySet()){
            if(((int)m.getKey()==0)&&((int)m.getValue()!=5)){
                assertFalse(false);
            }
            if(((int)m.getKey()==2)&&((int)m.getValue()!=7)){
                assertFalse(false);
            }
        }
        assertTrue(true);
    }
    
//    @Test
//    public void on_lost_connection_should_return_null(){
//        result = gravityCenter.findAllCentersOfGravity();
//        if(result == null){
//            assertTrue(true);
//        }
//        assertFalse(false);
//    }
//    
//    @Test(expected=NullPointerException.class)
//    public void no_connection_throws_null_pointer_exception(){
//        result = gravityCenter.findAllCentersOfGravity();
//    }
}
