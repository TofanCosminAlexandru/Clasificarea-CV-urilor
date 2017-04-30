/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana,
 * anul 2, grupa A1
 */
public class CvClassification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, Integer> experienceMap = new HashMap<>();
        experienceMap.put("c++", 2);
        experienceMap.put("java", 3);
        experienceMap.put("sql", 2);
        experienceMap.put("c#", 0);
        experienceMap.put("c", 0);
        experienceMap.put("plsql", 0);
        experienceMap.put("asm", 0);
        experienceMap.put(".net", 0);
        experienceMap.put("php", 0);
        experienceMap.put("js", 0);
        experienceMap.put("matlab", 0);
        experienceMap.put("r", 0);
        Map<String, Integer> programmingLanguagesMap = new HashMap<>();
        programmingLanguagesMap.put("c++", 1);
        programmingLanguagesMap.put("java", 1);
        programmingLanguagesMap.put("sql", 1);
        programmingLanguagesMap.put("c#", 0);
        programmingLanguagesMap.put("c", 0);
        programmingLanguagesMap.put("plsql", 0);
        programmingLanguagesMap.put("asm", 0);
        programmingLanguagesMap.put(".net", 0);
        programmingLanguagesMap.put("php", 0);
        programmingLanguagesMap.put("js", 0);
        programmingLanguagesMap.put("matlab", 0);
        programmingLanguagesMap.put("r", 0);
        Map<String, Integer> personalQualitiesMap = new HashMap<>();
        personalQualitiesMap.put("lucru in echipa", 1);
        personalQualitiesMap.put("comunicativ(a)", 1);
        personalQualitiesMap.put("dinamic(a)", 1);
        personalQualitiesMap.put("cod curat", 1);
        personalQualitiesMap.put("punctual(a)", 0);
        personalQualitiesMap.put("perseverent(a)", 0);
        personalQualitiesMap.put("ambitios(a)", 0);
        personalQualitiesMap.put("intelegator(are)", 0);
        personalQualitiesMap.put("onest(a)", 0);
        personalQualitiesMap.put("sincer(a)", 0);
        personalQualitiesMap.put("intuitiv(a)", 0);
        Map<String, Integer> languagesMap = new HashMap<>();
        languagesMap.put("english", 1);
        languagesMap.put("french", 1);
        languagesMap.put("germana", 0);
        languagesMap.put("rusa", 0);
        languagesMap.put("chineza", 0);
        languagesMap.put("spaniola", 0);
        languagesMap.put("italiana", 0);
        languagesMap.put("romana", 0);
        Cv cv1 = new Cv("Petrica Mihai", "02/05/1992", experienceMap, programmingLanguagesMap, 24, personalQualitiesMap, 2, languagesMap);

        System.out.print("Nume: " + cv1.getName() + "\n");
        System.out.print("Data nastere: " + cv1.getDateOfBirth() + "\n");
        System.out.print("Varsta: " + cv1.getAge() + "\n");
        System.out.print("Numar de proiecte semnificative realizate cu succes: " + cv1.getProjects() + "\n");
        System.out.print("Experienta: " + "\n");
        for (int i = 0; i < cv1.getExperience().size(); i++) {
            if (cv1.getExperience().get(cv1.getExperience().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Experienta in " + cv1.getExperience().keySet().toArray()[i] + " de " + cv1.getExperience().get(cv1.getExperience().keySet().toArray()[i].toString()) + " ani " + "\n");
            }
        }
        System.out.print("Limbaje de programare: " + "\n");
        for (int i = 0; i < cv1.getProgrammingLanguages().size(); i++) {
            if (cv1.getProgrammingLanguages().get(cv1.getProgrammingLanguages().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Limbajul " + cv1.getProgrammingLanguages().keySet().toArray()[i] + "\n");
            }
        }
        System.out.print("Calitati personale: " + "\n");
        for (int i = 0; i < cv1.getPersonalQualities().size(); i++) {
            if (cv1.getPersonalQualities().get(cv1.getPersonalQualities().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Calitatea " + cv1.getPersonalQualities().keySet().toArray()[i] + "\n");
            }
        }
        System.out.print("Limbi straine: " + "\n");
        for (int i = 0; i < cv1.getLanguages().size(); i++) {
            if (cv1.getLanguages().get(cv1.getLanguages().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Limba straina " + cv1.getLanguages().keySet().toArray()[i] + "\n");
            }
        }
        System.out.print("\n");

        experienceMap = new HashMap<>();
        experienceMap.put("c++", 1);
        experienceMap.put("java", 0);
        experienceMap.put("sql", 0);
        experienceMap.put("c#", 0);
        experienceMap.put("c", 0);
        experienceMap.put("plsql", 1);
        experienceMap.put("asm", 0);
        experienceMap.put(".net", 0);
        experienceMap.put("php", 0);
        experienceMap.put("js", 0);
        experienceMap.put("matlab", 3);
        experienceMap.put("r", 2);
        programmingLanguagesMap = new HashMap<>();
        programmingLanguagesMap.put("c++", 1);
        programmingLanguagesMap.put("java", 0);
        programmingLanguagesMap.put("sql", 0);
        programmingLanguagesMap.put("c#", 0);
        programmingLanguagesMap.put("c", 0);
        programmingLanguagesMap.put("plsql", 1);
        programmingLanguagesMap.put("asm", 0);
        programmingLanguagesMap.put(".net", 0);
        programmingLanguagesMap.put("php", 0);
        programmingLanguagesMap.put("js", 0);
        programmingLanguagesMap.put("matlab", 3);
        programmingLanguagesMap.put("r", 2);
        personalQualitiesMap = new HashMap<>();
        personalQualitiesMap.put("lucru in echipa", 1);
        personalQualitiesMap.put("comunicativ(a)", 1);
        personalQualitiesMap.put("dinamic(a)", 1);
        personalQualitiesMap.put("cod curat", 1);
        personalQualitiesMap.put("punctual(a)", 0);
        personalQualitiesMap.put("perseverent(a)", 0);
        personalQualitiesMap.put("ambitios(a)", 0);
        personalQualitiesMap.put("intelegator(are)", 1);
        personalQualitiesMap.put("onest(a)", 1);
        personalQualitiesMap.put("sincer(a)", 0);
        personalQualitiesMap.put("intuitiv(a)", 0);
        languagesMap = new HashMap<>();
        languagesMap.put("english", 1);
        languagesMap.put("french", 1);
        languagesMap.put("germana", 0);
        languagesMap.put("rusa", 0);
        languagesMap.put("chineza", 0);
        languagesMap.put("spaniola", 1);
        languagesMap.put("italiana", 0);
        languagesMap.put("romana", 0);
        Cv cv2 = new Cv("Avasilcai Ioana", "05/02/1990", experienceMap, programmingLanguagesMap, 27, personalQualitiesMap, 1, languagesMap);

        System.out.print("Nume: " + cv2.getName() + "\n");
        System.out.print("Data nastere: " + cv2.getDateOfBirth() + "\n");
        System.out.print("Varsta: " + cv2.getAge() + "\n");
        System.out.print("Numar de proiecte semnificative realizate cu succes: " + cv2.getProjects() + "\n");
        System.out.print("Experienta: " + "\n");
        for (int i = 0; i < cv2.getExperience().size(); i++) {
            if (cv2.getExperience().get(cv2.getExperience().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Experienta in " + cv2.getExperience().keySet().toArray()[i] + " de " + cv2.getExperience().get(cv2.getExperience().keySet().toArray()[i].toString()) + " ani " + "\n");
            }
        }
        System.out.print("Limbaje de programare: " + "\n");
        for (int i = 0; i < cv2.getProgrammingLanguages().size(); i++) {
            if (cv2.getProgrammingLanguages().get(cv2.getProgrammingLanguages().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Limbajul " + cv2.getProgrammingLanguages().keySet().toArray()[i] + "\n");
            }
        }
        System.out.print("Calitati personale: " + "\n");
        for (int i = 0; i < cv2.getPersonalQualities().size(); i++) {
            if (cv2.getPersonalQualities().get(cv2.getPersonalQualities().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Calitatea " + cv2.getPersonalQualities().keySet().toArray()[i] + "\n");
            }
        }
        System.out.print("Limbi straine: " + "\n");
        for (int i = 0; i < cv2.getLanguages().size(); i++) {
            if (cv2.getLanguages().get(cv2.getLanguages().keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + "Limba straina " + cv2.getLanguages().keySet().toArray()[i] + "\n");
            }
        }
        System.out.print("\n");

        double distance = new Classifier().distance(cv1, cv2);
        System.out.print("Distanta dintre cele doua cv-uri este: " + distance);
    }

}
