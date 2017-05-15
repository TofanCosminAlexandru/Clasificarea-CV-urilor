/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CenterOfGravity;

import cvclassification.CenterOfGravity;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class ModifyCvClusterIdTest {
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
    public void cvID_1_should_return_true(){
        int ID = 1;
        boolean result = gravityCenter.modifyCvClusterId(ID);
        assertTrue(result);
    }
    
    @Test
    public void cvID_5_should_return_true(){
        int ID = 1;
        boolean result = gravityCenter.modifyCvClusterId(ID);
        assertTrue(result);
    }
    
    @Test(expected=NullPointerException.class)
    public void negative_cluster_ID_should_throw_null_pointer_exception(){
        int nonValidID = -3;
        boolean result = gravityCenter.modifyCvClusterId(nonValidID);
    }
    
    @Test(expected=NullPointerException.class)
    public void non_existent_cluster_ID_should_throw_null_pointer_exception(){
        int missingID = 9999;
        boolean result = gravityCenter.modifyCvClusterId(missingID);
    }
    
//    @Test(expected=NullPointerException.class)
//    public void no_connection_throws_null_pointer_exception(){
//        int ID = 1;
//        boolean result = gravityCenter.modifyCvClusterId(ID);
//    }
    
}
