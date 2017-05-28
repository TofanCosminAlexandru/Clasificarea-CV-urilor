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
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana,
 * Ioja Petru-Alexandru, anul 2, grupa A1
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
            String[] technicalSkills  = new String[100];
            String[] softSkills = new String[100];

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

            PreparedStatement pstmt2 = con.prepareStatement("select job_title, experience_years from Experience where cv_id = ?");
            pstmt2.setInt(1, ID);
            ResultSet rs2 = pstmt2.executeQuery();
            while (rs2.next()) {
                experience.put(rs2.getString("job_title"), rs2.getInt("experience_years"));
            }
            pstmt2.close();

            PreparedStatement pstmt3 = con.prepareStatement("select certificate, study_years from Studies where cv_id = ?");
            pstmt3.setInt(1, ID);
            ResultSet rs3 = pstmt3.executeQuery();
            while (rs3.next()) {
                studies[0] = rs3.getInt("certificate");
                studies[1] = rs3.getInt("study_years");
            }
            pstmt3.close();

            PreparedStatement pstmt4 = con.prepareStatement("select skill from TechnicalSkills where cv_id = ?");
            pstmt4.setInt(1, ID);
            ResultSet rs4 = pstmt4.executeQuery();
            int count = 0;
            while (rs4.next()) {
                technicalSkills[count++] = rs4.getString("skill");
            }
            pstmt4.close();

            PreparedStatement pstmt5 = con.prepareStatement("select skill from SoftSkills where cv_id = ?");
            pstmt5.setInt(1, ID);
            ResultSet rs5 = pstmt5.executeQuery();
            count = 0;
            while (rs5.next()) {
                softSkills[count++] = rs5.getString("skill");
            }
            pstmt5.close();

            Cv cv = new Cv(ID, name, dateOfBirth, age, address, phoneNumber, email, experienceYears, idealJob, experience, studies, technicalSkills, softSkills);
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
