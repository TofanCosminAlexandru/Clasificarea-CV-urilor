/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CenterOfGravity;

import cvclassification.CenterOfGravity;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class FindTheMostSuitableClusterTest {
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
    public void cv_id_1_should_return_0(){
        int cvID = 1;
        int result = gravityCenter.findTheMostSuitableCluster(cvID);
        if(result == 0){
            assertTrue(true);
        }else{
            assertFalse(false);
        }
    }
    
    @Test
    public void cv_id_2_should_return_2(){
        int cvID = 2;
        int result = gravityCenter.findTheMostSuitableCluster(cvID);
        if(result == 2){
            assertTrue(true);
        }else{
            assertFalse(false);
        }
    }
    
    @Test(expected=NullPointerException.class)
    public void negative_CV_ID_should_throw_null_pointer_exception(){
        int nonValidID = -3;
        int result = gravityCenter.findTheMostSuitableCluster(nonValidID);
    }
    
    @Test(expected=NullPointerException.class)
    public void non_existent_CV_ID_should_throw_null_pointer_exception(){
        int missingID = 9999;
        int result = gravityCenter.findTheMostSuitableCluster(missingID);
    }
}
