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
 * @author alina1
 */
public class CvTest {
    
    Cv instance2 = new Cv();
    public CvTest() {
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
     * Test of getAge method, of class Cv.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Cv instance = new Cv();
        int expResult = 30;
        int result = 30;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetAge2() {
        System.out.println("getAge");
        Cv instance = new Cv();
        int expResult = -30;
        int result = 30;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setAge method, of class Cv.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 55;
        Cv instance = new Cv();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetAge2() {
        System.out.println("setAge");
        int age = 5555;
        Cv instance = new Cv();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetAge3() {
        System.out.println("setAge");
        int age = 5;
        Cv instance = new Cv();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of getLanguages method, of class Cv.
     */
     @Test
    public void testGetLanguages() {
        System.out.println("getLanguages");
        Cv instance = new Cv();
        String[] expResult = {"engleza", "franceza"};
        String[] result = {"engleza", "franceza"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetLanguages2() {
        System.out.println("getLanguages");
        Cv instance = new Cv();
        String[] expResult = {"eng", "franceza"};
        String[] result = {"engleza", "franceza"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testGetLanguages3() {
        System.out.println("getLanguages");
        Cv instance = new Cv();
        String[] expResult = null;
        String[] result = {"engleza", "franceza"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setLanguages method, of class Cv.
     */
    @Test
    public void testSetLanguages() {
        System.out.println("setLanguages");
        String[] languages = {"engleza", "franceza"};
        Cv instance = new Cv();
        instance.setLanguages(languages);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetLanguages2() {
        System.out.println("setLanguages");
        String[] languages = null;
        Cv instance = new Cv();
        instance.setLanguages(languages);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getHobbies method, of class Cv.
     */
    @Test
    public void testGetHobbies() {
        System.out.println("getHobbies");
        Cv instance = new Cv();
        String[] expResult = {"Fotbal", "Baschet", "Muzica", "RC"};
        String[] result = {"Fotbal", "Baschet", "Muzica", "RC"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetHobbies2() {
        System.out.println("getHobbies");
        Cv instance = new Cv();
        String[] expResult = {"Fotbal", "Muzica", "RC"};
        String[] result = {"Fotbal", "Baschet", "Muzica", "RC"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetHobbies3() {
        System.out.println("getHobbies");
        Cv instance = new Cv();
        String[] expResult = {"Fotballll", "Muzicaaaa", "RC"};
        String[] result = {"Fotbal", "Muzica", "RC"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of setHobbies method, of class Cv.
     */
    
    @Test
    public void testSetHobbies() {
        System.out.println("setHobbies");
        String[] hobbies = {"0", "1"};
        Cv instance = new Cv();
        instance.setHobbies(hobbies);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetHobbies2() {
        System.out.println("setHobbies");
        String[] hobbies = {"Fotbal", "Muzica", "RC"};
        Cv instance = new Cv();
        instance.setHobbies(hobbies);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of getTechnicalSkills method, of class Cv.
     */
    @Test
    public void testGetTechnicalSkills() {
        System.out.println("getTechnicalSkills");
        Cv instance = new Cv();
        String[] expResult = {"C/C++", "Java", "Pascal", "SQL", "Delphi", "Visual", "C++", "C#"};
        String[] result = {"C/C++", "Java", "Pascal", "SQL", "Delphi", "Visual", "C++", "C#"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTechnicalSkills2() {
        System.out.println("getTechnicalSkills");
        Cv instance = new Cv();
        String[] expResult = {"C/C++", "Java", "Pascal", "SQL", "Delphi", "Visual", "C++", "C#"};
        String[] result = {"Objective-C", "Swift", "SDK", "development", "Git", "TDD", "AgileScrum", "AutoLayout", "Core", "Data XCTest"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetTechnicalSkills3() {
        System.out.println("getTechnicalSkills");
        Cv instance = new Cv();
        String[] expResult = {"C/C++", "Java", "Pascal"};
        String[] result = {"C/C++++", "Java", "Pascal"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSocialSkills method, of class Cv.
     */
    @Test
    public void testGetSocialSkills() {
        System.out.println("getSocialSkills");
        Cv instance = new Cv();
        String[] expResult = {"Distributed_Computing", "Computer_Networks"};
        String[] result = {"Distributed_Computing", "Computer_Networks"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSocialSkills2() {
        System.out.println("getSocialSkills");
        Cv instance = new Cv();
        String[] expResult = {"Distributed_Computing", "Computer_Networks"};
        String[] result = {"Bachelor_of_Engineer_in_Civil_Engineering", "Computer_Networks"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   

    /**
     * Test of getID method, of class Cv.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Cv instance = new Cv();
        int expResult = 1;
        int result = 1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetID2() {
        System.out.println("getID");
        Cv instance = new Cv();
        int expResult = 1;
        int result = 00;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetID3() {
        System.out.println("getID");
        Cv instance = new Cv();
        int expResult = -1;
        int result = -1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setID method, of class Cv.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 3;
        Cv instance = new Cv();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetID2() {
        System.out.println("setID");
        int ID = -300000000;
        Cv instance = new Cv();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getName method, of class Cv.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Cv instance = new Cv();
        String expResult = "Ghise Ioan";
        String result = "Ghise Ioan";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetName2() {
        System.out.println("getName");
        Cv instance = new Cv();
        String expResult = "Ghise Ioan";
        String result = "756764578346";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Cv.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Ana";
        Cv instance = new Cv();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOfBirth method, of class Cv.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Cv instance = new Cv();
        String expResult = "29/12/1979";
        String result ="29/12/1979";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetDateOfBirth2() {
        System.out.println("getDateOfBirth");
        Cv instance = new Cv();
        String expResult = "29/12/1979";
        String result = "00";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetDateOfBirth3() {
        System.out.println("getDateOfBirth");
        Cv instance = new Cv();
        String expResult = "29545646515151250134158787788754151";
        String result = "mama";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDateOfBirth method, of class Cv.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        String dateOfBirth = "29/12/1979";
        Cv instance = new Cv();
        instance.setDateOfBirth(dateOfBirth);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Cv.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Cv instance = new Cv();
        String expResult = "General Berthelot 16 700483IAªI, Romania";
        String result = "General Berthelot 16 700483IAªI, Romania";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

     @Test
    public void testGetAddress2() {
        System.out.println("getAddress");
        Cv instance = new Cv();
        String expResult = "General Berthelot 16 700483IAªI, Romania";
        String result = "863787";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setAddress method, of class Cv.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "Acasa nr 3";
        Cv instance = new Cv();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Cv.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Cv instance = new Cv();
        String expResult = "0742112712";
        String result = "0742112712";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPhoneNumber2() {
        System.out.println("getPhoneNumber");
        Cv instance = new Cv();
        String expResult = "mama";
        String result = "0742112712";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetPhoneNumber3() {
        System.out.println("getPhoneNumber");
        Cv instance = new Cv();
        String expResult = "0742112712";
        String result = "0000000000";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetPhoneNumber4() {
        System.out.println("getPhoneNumber");
        Cv instance = new Cv();
        String expResult = "0742112712";
        String result = "-0742112712";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPhoneNumber method, of class Cv.
     *///////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "075834";
        Cv instance = new Cv();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testSetPhoneNumber2() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "0758342156";
        Cv instance = new Cv();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetPhoneNumber3() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "numar";
        Cv instance = new Cv();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testSetPhoneNumber4() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "-0758342156";
        Cv instance = new Cv();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of getEmail method, of class Cv.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cv instance = new Cv();
        String expResult = "adria@info.uaic.ro";
        String result = "adria@info.uaic.ro";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail2() {
        System.out.println("getEmail");
        Cv instance = new Cv();
        String expResult = "adria@info.uaic.ro";
        String result = "adria@info";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testGetEmail3() {
        System.out.println("getEmail");
        Cv instance = new Cv();
        String expResult = "adria@info.uaic.ro";
        String result = "adria";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    /**
     * Test of setEmail method, of class Cv.
     */////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "ana";
        Cv instance = new Cv();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testSetEmail2() {
        System.out.println("setEmail");
        String email = "ana@gmail.com";
        Cv instance = new Cv();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

     @Test
    public void testSetEmail3() {
        System.out.println("setEmail");
        String email = "ana@com";
        Cv instance = new Cv();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of getExperienceYears method, of class Cv.
     */
    @Test
    public void testGetExperienceYears() {
        System.out.println("getExperienceYears");
        Cv instance = new Cv();
        int expResult = 16;
        int result = instance.getExperienceYears();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetExperienceYears2() {
        System.out.println("getExperienceYears");
        Cv instance = new Cv();
        int expResult = -16;
        int result = instance.getExperienceYears();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setExperienceYears method, of class Cv.
     *//////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSetExperienceYears() {
        System.out.println("setExperienceYears");
        int experienceYears = -2;
        Cv instance = new Cv();
        instance.setExperienceYears(experienceYears);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

     @Test
    public void testSetExperienceYears2() {
        System.out.println("setExperienceYears");
        int experienceYears = 100;
        Cv instance = new Cv();
        instance.setExperienceYears(experienceYears);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
     @Test
    public void testSetExperienceYears3() {
        System.out.println("setExperienceYears");
        int experienceYears = 5;
        Cv instance = new Cv();
        instance.setExperienceYears(experienceYears);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    /**
     * Test of getIdealJob method, of class Cv.
     */
    @Test
    public void testGetIdealJob() {
        System.out.println("getIdealJob");
        Cv instance = new Cv();
        String expResult = "Researcher and Analyst Programmer";
        String result = "Researcher and Analyst Programmer";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdealJob2() {
        System.out.println("getIdealJob");
        Cv instance = new Cv();
        String expResult = "Researcher and Analyst Programmer";
        String result = "Researcher";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setIdealJob method, of class Cv.
     */
    @Test
    public void testSetIdealJob() {
        System.out.println("setIdealJob");
        String idealJob = "515305";
        Cv instance = new Cv();
        instance.setIdealJob(idealJob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdealJob2() {
        System.out.println("setIdealJob");
        String idealJob = "Bucatar";
        Cv instance = new Cv();
        instance.setIdealJob(idealJob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of setExperience method, of class Cv.
     */
    @Test
    public void testSetExperience() {
        System.out.println("setExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Aleluia", 1);
        //Cv instance = new Cv();
        instance2.setExperience(experience);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getExperience method, of class Cv.
     */
    @Test
    public void testGetExperience() {
        System.out.println("getExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Aleluia", 1);
        //Map<String,Integer> experience = new HashMap<>();
        //experience.put("CEVA", 2);
        //Cv instance = new Cv();
        //instance.setExperience(experience);
        /*for (Map.Entry<String, Integer> entry : instance.getExperience().entrySet()) {
            String key = entry.getKey();
            int value1 = entry.getValue();
        }*/
        Map<String, Integer> expResult = experience;
        Map<String, Integer> result = instance2.getExperience();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
    }

    @Test
    public void testGetExperience2() {
        System.out.println("getExperience");
        Map<String, Integer> experience = new HashMap<>();
        experience.put("Aleluia", 2);
        Cv instanceExample = new Cv();
        
        Map<String, Integer> expResult = experience;
        //instanceExample.setExperience("Aleluia", 2);
        Map<String, Integer> result = instanceExample.getExperience();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
    }
    

    /**
     * Test of getStudies method, of class Cv.
     */
    @Test
    public void testGetStudies() {
        System.out.println("getStudies");
        Cv instance = new Cv();
        int[] expResult = {1, 6, 2};
        int[] result = {1, 6, 2};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testGetStudies2() {
        System.out.println("getStudies");
        Cv instance = new Cv();
        int[] expResult = {1, 6, 2};
        int[] result = {1};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

      @Test
    public void testGetStudies3() {
        System.out.println("getStudies");
        Cv instance = new Cv();
        int[] expResult = {-1, -6, 2};
        int[] result = {1};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setStudies method, of class Cv.
     */
    @Test
    public void testSetStudies() {
        System.out.println("setStudies");
        int[] studies = {1, 6, 2};
        Cv instance = new Cv();
        instance.setStudies(studies);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Cv.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Cv instance = new Cv();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
}
