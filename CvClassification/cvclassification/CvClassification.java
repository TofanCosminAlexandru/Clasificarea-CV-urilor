/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import daoOracle.CvController;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana, IOJA Ş. PETRU-ALEXANDRU
 * anul 2, grupa A1
 */
public class CvClassification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CvController cvController = new CvController();
        Classifier classifier = new Classifier();
        
        Cv cv1 = cvController.getByID(1);
        Cv cv2 = cvController.getByID(2);
        
        cv1.display();
        cv2.display();

        double sqrtDistance = classifier.sqrtDistance(classifier.valuesForComputingGeneralDistance(cv1, cv2));
        double absDistance = classifier.absDistance(classifier.valuesForComputingGeneralDistance(cv1, cv2));
        double fraction1Distance = classifier.fraction1Distance(classifier.valuesForComputingGeneralDistance(cv1, cv2));
        double fraction2Distance = classifier.fraction2Distance(classifier.valuesForComputingGeneralDistance(cv1, cv2));
        System.out.print("Distanta (folosind formula cu radicali) dintre cele doua cv-uri este: " + sqrtDistance + "\n");
        System.out.print("Distanta (folosind formula cu module) dintre cele doua cv-uri este: " + absDistance + "\n");
        System.out.print("Distanta (folosind prima formula cu fractii) dintre cele doua cv-uri este: " + fraction1Distance + "\n");
        System.out.print("Distanta (folosind a doua formula cu fractii) dintre cele doua cv-uri este: " + fraction2Distance + "\n");
    }

}
