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

    private int ID;
    private String name;
    private String dateOfBirth;
    private int age; /**/
    private String address;
    private String phoneNumber;
    private String email;
    private int experienceYears; /**/
    private String idealJob;
    private Map<String, Integer> experience; /**/
    private int[] studies; /**/
    private String[] languages; /**/
    private String[] hobbies;
    private String[] technicalSkills; /**/
    private String[] socialSkills; /**/

    public Cv() {
        this.ID = 0;
        this.name = "";
        this.dateOfBirth = "";
        this.age = 0;
        this.address = "";
        this.phoneNumber = "";
        this.email = "";
        this.idealJob = "";
        this.experienceYears = 0;
        this.studies = new int[2];
        this.experience = new HashMap<>();
        /*this.languages = new String[100];
        this.hobbies = new String[100];
        this.technicalSkills = new String[100];
        this.socialSkills = new String[100];*/
    }

    public Cv(int ID,
            String name,
            String dateOfBirth,
            int age,
            String address,
            String phoneNumber,
            String email,
            int experienceYears,
            String idealJob,
            Map<String, Integer> experience,
            int[] studies,
            String[] languages,
            String[] hobbies,
            String[] technicalSkills,
            String[] socialSkills) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idealJob = idealJob;
        this.experienceYears = experienceYears;
        this.studies = new int[2];
        System.arraycopy(studies, 0, this.studies, 0, studies.length);
        this.experience = experience;
        this.languages = new String[languages.length];
        this.hobbies = new String[hobbies.length];
        this.technicalSkills = new String[technicalSkills.length];
        this.socialSkills = new String[socialSkills.length];
        System.arraycopy(languages, 0, this.languages, 0, languages.length);
        System.arraycopy(hobbies, 0, this.hobbies, 0, hobbies.length);
        System.arraycopy(technicalSkills, 0, this.technicalSkills, 0, technicalSkills.length);
        System.arraycopy(socialSkills, 0, this.socialSkills, 0, socialSkills.length);
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
     * @return the languages
     */
    public String[] getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    /**
     * @return the hobbies
     */
    public String[] getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the technicalSkills
     */
    public String[] getTechnicalSkills() {
        return technicalSkills;
    }

    /**
     * @param technicalSkills the technicalSkills to set
     */
    public void setTechnicalSkills(String[] technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    /**
     * @return the socialSkills
     */
    public String[] getSocialSkills() {
        return socialSkills;
    }

    /**
     * @param socialSkills the socialSkills to set
     */
    public void setSocialSkills(String[] socialSkills) {
        this.socialSkills = socialSkills;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the experienceYears
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * @param experienceYears the experienceYears to set
     */
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    /**
     * @return the idealJob
     */
    public String getIdealJob() {
        return idealJob;
    }

    /**
     * @param idealJob the idealJob to set
     */
    public void setIdealJob(String idealJob) {
        this.idealJob = idealJob;
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
     * @return the studies
     */
    public int[] getStudies() {
        return studies;
    }

    /**
     * @param studies the studies to set
     */
    public void setStudies(int[] studies) {
        this.studies = studies;
    }

    public void display() {
        System.out.print("ID: " + this.ID + "\n");
        System.out.print("Nume: " + this.name + "\n");
        System.out.print("Data nastere: " + this.dateOfBirth + "\n");
        System.out.print("Varsta: " + this.getAge() + "\n");
        System.out.print("Adresa: " + this.address + "\n");
        System.out.print("Numar de telefon: " + this.phoneNumber + "\n");
        System.out.print("Email: " + this.email + "\n");
        System.out.print("Job ideal: " + this.idealJob + "\n");
        System.out.print("Ani experienta totala: " + this.experienceYears + "\n");
        System.out.print("Experienta pe domenii: " + "\n");
        for (int i = 0; i < this.experience.size(); i++) {
            if (this.experience.get(this.experience.keySet().toArray()[i].toString()) != 0) {
                System.out.print("\t" + this.experience.keySet().toArray()[i] + " --> " + this.experience.get(this.experience.keySet().toArray()[i].toString()) + " ani " + "\n");
            }
        }

        System.out.print("Studii: " + "\n");
        switch (this.studies[0]) {
            case 0:
                System.out.print("\tLiceu: " + this.studies[1] + " ani" + "\n");
                break;
            case 2:
                System.out.print("\tLiceu: " + 4 + " ani" + "\n");
                System.out.print("\tLicenta: " + this.studies[1] + " ani" + "\n");
                break;
            case 4:
                System.out.print("\tLiceu: " + 4 + " ani" + "\n");
                System.out.print("\tLicenta: " + 4 + " ani" + "\n");
                System.out.print("\tMaster: " + this.studies[1] + " ani" + "\n");
                break;
            case 6:
                System.out.print("\tLiceu: " + 4 + " ani" + "\n");
                System.out.print("\tLicenta: " + 4 + " ani" + "\n");
                System.out.print("\tMaster: " + 3 + " ani" + "\n");
                System.out.print("\tDoctorat: " + this.studies[1] + " ani" + "\n");
                break;
            default:
                break;
        }

        System.out.print("Limbi straine: " + "\n");
        for (String language : languages) {
            if (language != null) {
                System.out.print("\t" + language + "\n");
            }
        }
        System.out.print("Hobby-uri: " + "\n");
        for (String hobby : hobbies) {
            if (hobby != null) {
                System.out.print("\t" + hobby + "\n");
            }
        }
        System.out.print("Competente tehnice: " + "\n");
        for (String technicalSkill : technicalSkills) {
            if (technicalSkill != null) {
                System.out.print("\t" + technicalSkill + "\n");
            }
        }
        System.out.print("Competente sociale: " + "\n");
        for (String socialSkill : socialSkills) {
            if (socialSkill != null) {
                System.out.print("\t" + socialSkill + "\n");
            }
        }
        System.out.print("\n");
    }
}
