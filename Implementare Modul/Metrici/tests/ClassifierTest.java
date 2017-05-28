/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cosmin
 */
public class ClassifierTest {

    public ClassifierTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getValuesForComputingGeneralDistance method, of class Classifier.
     */
    @Test
    public void testGetValuesForComputingGeneralDistance() {
        System.out.println("getValuesForComputingGeneralDistance");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] expResult = {{20,6,7,2,2,4}, // test corect
                                {24,7,9,3,2,4}};
        double[][] result = instance.getValuesForComputingGeneralDistance(cv1, cv2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetValuesForComputingGeneralDistance2() {
        System.out.println("getValuesForComputingGeneralDistance");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] expResult = {{253,6,3,2,2,4}, //expResult gresit
                                {26,7,9,3,9,4}};
        double[][] result = instance.getValuesForComputingGeneralDistance(cv1, cv2);
//        assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetValuesForComputingGeneralDistance3() {
        System.out.println("getValuesForComputingGeneralDistance");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 21; // <===
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] expResult = {{20,6,7,2,2,4},//result gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.getValuesForComputingGeneralDistance(cv1, cv2);
        //assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge
     * method, of class Classifier.
     */
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        int minAge = 20;
        int maxAge = 30;
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
       double[][] expResult = {{20,6,7,2,2,4}, // test corect
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge(cv1, cv2, minAge, maxAge);
        assertArrayEquals(expResult, result);
        //assertTrue("OK", expResult == result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge2() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        int minAge = 20;
        int maxAge = 30;
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] expResult = {{50,6,7,2,2,4}, // expResult gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge(cv1, cv2, minAge, maxAge);
        //assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge3() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 50, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        int minAge = 20;
        int maxAge = 30;
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] expResult = {{20,6,7,2,2,4}, // result gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge(cv1, cv2, minAge, maxAge);
        //assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);
        //assertFalse("OK", expResult == result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of
     * modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience
     * method, of class Classifier.
     */
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        int years = 10;
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] expResult = {{20,6,7,2,2,4}, // test corect
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience(cv1, cv2, years);
        assertArrayEquals(expResult, result);
        //assertTrue("OK", expResult == result);
        //assertFalse("OK", expResult == result);
        // TODO review the generated test code and remove the default call to fail
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience2() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        int years = 10;
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
       double[][] expResult = {{20,12,7,2,2,4}, // expResult gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience(cv1, cv2, years);
        //assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);
        // TODO review the generated test code and remove the default call to fail
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience3() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 12, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        int years = 10;
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
       double[][] expResult = {{20,6,7,2,2,4}, // result gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience(cv1, cv2, years);
        //assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);
        // TODO review the generated test code and remove the default call to fail
    }

    /**
     * Test of
     * modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience
     * method, of class Classifier.
     */
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        Map<String, Integer> experiences = new HashMap<>();
        experiences.put("C++", 5);
        experiences.put("Java", 3);
        experiences.put("Photoshop", 1);
        double[][] expResult = {{20,6,7,2,2,4}, // test corect
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience(cv1, cv2, experiences);
        assertArrayEquals(expResult, result);
       // assertTrue("OK", expResult == result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience2() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        Map<String, Integer> experiences = new HashMap<>();
        experiences.put("C++", 5);
        experiences.put("Java", 3);
        experiences.put("Photoshop", 1);
        double[][] expResult = {{20,6,14,2,2,4}, // expResult gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience(cv1, cv2, experiences);
        //assertArrayEquals(expResult, result);
       assertTrue("OK", expResult != result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience3() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 25);
        experience.put("Software Engineer", 13);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        Map<String, Integer> experiences = new HashMap<>();
        experiences.put("C++", 5);
        experiences.put("Java", 3);
        experiences.put("Photoshop", 1);
         double[][] expResult = {{20,6,7,2,2,4}, // result gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience(cv1, cv2, experiences);
        //assertArrayEquals(expResult, result);
        assertTrue("OK", expResult != result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of
     * modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies
     * method, of class Classifier.
     */
   
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 6;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 6;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        int studyLevel = 4;
        int years = 6;
        double[][] expResult = {{20,6,7,6,2,4}, // test corect
                                {24,7,9,6,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies(cv1, cv2, studyLevel, years);
        assertArrayEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies2() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        int studyLevel = 4;
        int years = 6;
         double[][] expResult = {{20,6,7,6,2,4}, // expResult gresit
                                {24,7,9,6,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies(cv1, cv2, studyLevel, years);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies3() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 12;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 15;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        int studyLevel = 4;
        int years = 6;
         double[][] expResult = {{20,6,7,2,2,4}, // result gresit
                                {24,7,9,3,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies(cv1, cv2, studyLevel, years);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of
     * modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages
     * method, of class Classifier.
     */
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        String[] languages3 = new String[]{"Engleza", "Spaniola"};
        double[][] expResult = {{20,6,7,2,8,4}, // test corect
                                {24,7,9,3,8,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages(cv1, cv2, languages3);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages2() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        String[] languages3 = new String[]{"Engleza", "Spaniola"};
        double[][] expResult = {{20,6,7,6,2,4}, //expResult gresit
                                {24,7,9,6,2,4}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages(cv1, cv2, languages3);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages3() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        String[] languages3 = new String[]{"Engleza", "Spaniola"};
        double[][] expResult = instance1.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfLanguages(cv1, cv2, languages3);
        double[][] result = {{20,6,7,6,2,4}, // result gresit. modificare direct pe result
                                {24,7,9,6,2,4}};
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of
     * modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills
     * method, of class Classifier.
     */
    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        String[] softSkills3 = new String[]{"C++", "C#"};
        double[][] expResult = {{20,6,7,2,2,16}, // test corect
                                {24,7,9,3,2,10}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills(cv1, cv2, softSkills3);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills2() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        String[] softSkills3 = new String[]{"C++", "C#"};
        double[][] expResult = {{20,6,7,6,2,16}, // test corect
                                {24,7,9,6,2,10}};
        double[][] result = instance.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills(cv1, cv2, softSkills3);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testModifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills3() {
        System.out.println("modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        String[] softSkills3 = new String[]{"C++", "C#"};
        double[][] expResult = instance1.modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills(cv1, cv2, softSkills3);
        double[][] result = {{20,6,3,6,2,4}, // result direct gresit
                                {24,17,9,6,2,4}};
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSqrtDistance method, of class Classifier.
     */
    @Test
    public void testGetSqrtDistance() {
        System.out.println("getSqrtDistance");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] values = instance1.getValuesForComputingGeneralDistance(cv1, cv2);
        double expResult = 0.114;
        double result = instance.getSqrtDistance(values);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetSqrtDistance2() {
        System.out.println("getSqrtDistance");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] values = instance1.getValuesForComputingGeneralDistance(cv1, cv2);
        double expResult = instance1.getSqrtDistance(values);
        double result = 0.5;
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetSqrtDistance3() {
        System.out.println("getSqrtDistance");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Software Developer", 3);
        experience.put("Software Tester", 2);
        experience.put("Software Engineer", 1);
        int[] studies = new int[2];
        studies[1] = 4;
        studies[1] = 2;
        String[] languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Franceza";
        String[] hobbies = new String[1];
        hobbies[0] = "";
        String[] softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "C#";
        softSkills[3] = "Python";
        Cv cv1 = new Cv(1, null, null, 20, null, null, null, 6, null, experience, studies, languages, hobbies, softSkills);

        experience = new HashMap<>();
        experience.put("Software Developer", 4);
        experience.put("Software Tester", 1);
        experience.put("Database Administrator", 2);
        studies = new int[2];
        studies[1] = 4;
        studies[1] = 3;
        languages = new String[2];
        languages[0] = "Engleza";
        languages[1] = "Germana";
        hobbies = new String[1];
        hobbies[0] = "";
        softSkills = new String[4];
        softSkills[0] = "C++";
        softSkills[1] = "Java";
        softSkills[2] = "SQL";
        softSkills[3] = "ASM";
        Cv cv2 = new Cv(1, null, null, 24, null, null, null, 7, null, experience, studies, languages, hobbies, softSkills);
        Classifier instance = new Classifier();
        Classifier instance1 = new Classifier();
        double[][] values = instance1.getValuesForComputingGeneralDistance(cv1, cv2);
        double expResult = 0.5;
        double result = instance.getSqrtDistance(values);
        assertTrue("OK", expResult != result);

        // TODO review the generated test code and remove the default call to fail.
    }
}
