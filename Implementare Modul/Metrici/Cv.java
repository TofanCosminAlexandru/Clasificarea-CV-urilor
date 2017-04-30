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
public class Cv {

    private static int count = 0;
    private int ID;
    private String name;
    private String dateOfBirth;
    private Map<String, Integer> experience;
    private Map<String, Integer> programmingLanguages;
    private int age;
    private Map<String, Integer> personalQualities;
    private int projects;
    private Map<String, Integer> languages;

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the experience
     */
    public Map<String, Integer> getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(Map<String, Integer> experience) {
        this.experience = experience;
    }

    /**
     * @return the programmingLanguages
     */
    public Map<String, Integer> getProgrammingLanguages() {
        return programmingLanguages;
    }

    /**
     * @param programmingLanguages the programmingLanguages to set
     */
    public void setProgrammingLanguages(Map<String, Integer> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the personalQualities
     */
    public Map<String, Integer> getPersonalQualities() {
        return personalQualities;
    }

    /**
     * @param personalQualities the personalQualities to set
     */
    public void setPersonalQualities(Map<String, Integer> personalQualities) {
        this.personalQualities = personalQualities;
    }

    /**
     * @return the projects
     */
    public int getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(int projects) {
        this.projects = projects;
    }

    /**
     * @return the languages
     */
    public Map<String, Integer> getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(Map<String, Integer> languages) {
        this.languages = languages;
    }

    public Cv() {
        ID = ++count;
        this.name = "";
        this.dateOfBirth = "";
        this.experience = new HashMap<>();
        this.languages = new HashMap<>();
        this.personalQualities = new HashMap<>();
        this.programmingLanguages = new HashMap<>();
        this.age = 0;
        this.projects = 0;
    }

    public Cv(String name,
            String dateOfBirth,
            Map<String, Integer> experience,
            Map<String, Integer> programmingLanguages,
            int age,
            Map<String, Integer> personalQualities,
            int projects,
            Map<String, Integer> languages) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.languages = languages;
        this.personalQualities = personalQualities;
        this.programmingLanguages = programmingLanguages;
        this.age = age;
        this.projects = projects;
    }
}
