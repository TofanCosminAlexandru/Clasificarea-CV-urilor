/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoOracle;

import cvclassification.Cv;
import cvclassification.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana, Ioja Petru-Alexandru,
 * anul 2, grupa A1
 */
public class CvController {

    public Cv getByID(int ID) {
        try {
            String name = null;
            String dateOfBirth = null;
            int age = 0;
            String address = null;
            String phoneNumber = null;
            String email = null;
            int experienceYears = 0;
            String idealJob = null;
            Map<String, Integer> experience = new HashMap<>();
            int[] studies = new int[2];
            String[] languages = null/* = new String[100]*/;
            String[] hobbies = null/* = new String[100]*/;
            String[] technicalSkills = null/* = new String[100]*/;
            String[] socialSkills = null/* = new String[100]*/;

            Connection con = Database.getConnection();

            PreparedStatement pstmt1 = con.prepareStatement("select name, to_char(date_of_birth), floor(trunc(months_between(sysdate, date_of_birth))/12), "
                    + "address, phone_number, email, experience_years, ideal_job from CurriculumVitae where id = ?");
            pstmt1.setInt(1, ID);
            ResultSet rs1 = pstmt1.executeQuery();
            while (rs1.next()) {
                name = rs1.getString("name");
                dateOfBirth = rs1.getString(2);
                age = rs1.getInt(3);
                address = rs1.getString("address");
                phoneNumber = rs1.getString("phone_number");
                email = rs1.getString("email");
                experienceYears = rs1.getInt("experience_years");
                idealJob = rs1.getString("ideal_job");
            }
            pstmt1.close();

            PreparedStatement pstmt2 = con.prepareStatement("select job_title, experience_years from Experience where experience_id = (select experience_id from CurriculumVitae where id = ?)");
            pstmt2.setInt(1, ID);
            ResultSet rs2 = pstmt2.executeQuery();
            while (rs2.next()) {
                experience.put(rs2.getString("job_title"), rs2.getInt("experience_years"));
            }
            pstmt2.close();

            PreparedStatement pstmt3 = con.prepareStatement("select certificate, study_years from Studies where studies_id = (select studies_id from CurriculumVitae where id = ?)");
            pstmt3.setInt(1, ID);
            ResultSet rs3 = pstmt3.executeQuery();
            while (rs3.next()) {
                studies[0] = rs3.getInt("certificate");
                studies[1] = rs3.getInt("study_years");
            }
            pstmt3.close();

            PreparedStatement pstmt4 = con.prepareStatement("select language from LanguageSkills where language_id = (select language_id from CurriculumVitae where id = ?)");
            pstmt4.setInt(1, ID);
            ResultSet rs4 = pstmt4.executeQuery();
            while (rs4.next()) {
                int count = 0;
                String clob = rs4.getString("language");
                String parts[] = clob.split(" ");
                languages = new String[parts.length];
                for (String part : parts) {
                    languages[count++] = part;
                }
            }
            pstmt4.close();

            PreparedStatement pstmt5 = con.prepareStatement("select hobby, hobby_id from Hobbies where hobby_id = (select hobby_id from CurriculumVitae where id = ?)");
            pstmt5.setInt(1, ID);
            ResultSet rs5 = pstmt5.executeQuery();
            while (rs5.next()) {
                int count = 0;
                String clob = rs5.getString("hobby");
                String parts[] = clob.split(" ");
                hobbies = new String[parts.length];
                for (String part : parts) {
                    hobbies[count++] = part;
                }
            }
            pstmt5.close();

            PreparedStatement pstmt6 = con.prepareStatement("select skill from TECHNICAL_SKILLS where TECHNICAL_SKILL_ID = (select TECHNICAL_SKILL_ID from SoftSkills where SOFTSKILL_ID = (select SOFTSKILL_ID from CurriculumVitae where id = ?))");
            pstmt6.setInt(1, ID);
            ResultSet rs6 = pstmt6.executeQuery();
            while (rs6.next()) {
                int count = 0;
                String clob = rs6.getString("skill");
                String parts[] = clob.split(" ");
                technicalSkills = new String[parts.length];
                for (String part : parts) {
                    technicalSkills[count++] = part;
                }
            }
            pstmt6.close();

            PreparedStatement pstmt7 = con.prepareStatement("select skill from SOCIAL_SKILLS where SOCIAL_SKILL_ID = (select SOCIAL_SKILL_ID from SoftSkills where SOFTSKILL_ID = (select SOFTSKILL_ID from CurriculumVitae where id = ?))");
            pstmt7.setInt(1, ID);
            ResultSet rs7 = pstmt7.executeQuery();
            while (rs7.next()) {
                int count = 0;
                String clob = rs7.getString("skill");
                String parts[] = clob.split(" ");
                socialSkills = new String[parts.length];
                for (String part : parts) {
                    socialSkills[count++] = part;
                }
            }
            pstmt7.close();

            Cv cv = new Cv(ID, name, dateOfBirth, age, address, phoneNumber, email, experienceYears, idealJob, experience, studies, languages, hobbies, technicalSkills, socialSkills);
            return cv;

        } catch (SQLException ex) {
            Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Cv> getClusterCvsByClusterID(int ID) {
        try {
            List<Cv> clusterCvs = new ArrayList<>();
            
            Connection con = Database.getConnection();
            
            PreparedStatement pstmt1 = con.prepareStatement("select id from CurriculumVitae where cluster_id = ?");
            pstmt1.setInt(1, ID);
            ResultSet rs1 = pstmt1.executeQuery();
            while (rs1.next()) {
                clusterCvs.add(getByID(rs1.getInt("id")));
            }
            pstmt1.close();
            
            return clusterCvs;
        } catch (SQLException ex) {
            Logger.getLogger(CvController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
