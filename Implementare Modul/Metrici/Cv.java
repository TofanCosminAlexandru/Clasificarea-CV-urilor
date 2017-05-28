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
 * Ioja Petru-Alexandru, anul 2, grupa A1
 */
public class Cv {

    private int ID;
    private String name;
    private String dateOfBirth;
    /* v */
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
    /* v */
    private int experienceYears;
    private String idealJob;
    /* v */
    private Map<String, Integer> experience;
    /* v */
    private int[] studies; // studies[0] - nivelul de studiu, studies[1] - numarul de ani activi de la acel nivel
    /* v */
    private String[] technicalSkills;
    /* v */
    private String[] softSkills;

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
        /*this.technicalSkills = new String[100];
        this.softSkills = new String[100];*/
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
            String[] technicalSkills,
            String[] softSkills) {
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
        this.experience = new HashMap<>();
        for (Map.Entry<String, Integer> entry : experience.entrySet()) {
            this.experience.put(entry.getKey(), entry.getValue());
        }
        this.technicalSkills = new String[technicalSkills.length];
        this.softSkills = new String[softSkills.length];
        System.arraycopy(technicalSkills, 0, this.technicalSkills, 0, technicalSkills.length);
        System.arraycopy(softSkills, 0, this.softSkills, 0, softSkills.length);
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
     * @return the softSkills
     */
    public String[] getSoftSkills() {
        return softSkills;
    }

    /**
     * @param softSkills the softSkills to set
     */
    public void setSoftSkills(String[] softSkills) {
        this.softSkills = softSkills;
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

        System.out.print("Technical skills: " + "\n");
        for (String technicalSkill : technicalSkills) {
            if (technicalSkill != null) {
                System.out.print("\t" + technicalSkill + "\n");
            }
        }
        System.out.print("Soft skills: " + "\n");
        for (String softSkill : softSkills) {
            if (softSkill != null) {
                System.out.print("\t" + softSkill + "\n");
            }
        }
        System.out.print("\n");
    }
}
