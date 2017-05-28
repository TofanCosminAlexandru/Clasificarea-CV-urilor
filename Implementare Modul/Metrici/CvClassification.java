/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import daoOracle.CvController;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana,
 * Ioja Petru-Alexandru, anul 2, grupa A1
 */
public class CvClassification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cv cv1 = new CvController().getByID(150);
        Cv cv2 = new CvController().getByID(130);
        cv1.display();
        cv2.display();

        System.out.print(new Classifier().getSqrtDistance(150, 130, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, null));
    }

}
