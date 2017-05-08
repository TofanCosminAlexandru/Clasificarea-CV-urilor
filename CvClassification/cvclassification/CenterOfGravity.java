package cvclassification;

import daoOracle.CvController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Chirila Andrei Liviu, Corduneanu Florian Mihai anul 2, grupa A1,
 * modulul 3
 */
public class CenterOfGravity {

    private CvController cvController = new CvController();
    private Classifier classifier = new Classifier();
    
    /**
     * 
     * @param cvID 
     * @return id-ul clusterului de care apartine cv-ul
     */
    public int findTheMostSuitableCluster (int cvID ){
        HashMap<Integer, Integer> centersOfGravity = this.findAllCentersOfGravity();
        double minDistance=999,distance;
        int clusterID = -1;
        Cv cv1,cv2;
        cv1 = cvController.getByID(cvID);
        for(Map.Entry m:centersOfGravity.entrySet()){
            cv2 = cvController.getByID((int) m.getValue());
            distance = classifier.getSqrtDistance(classifier.getValuesForComputingGeneralDistance(cv1, cv2));
            if(distance < minDistance){
                minDistance = distance;
                clusterID = (int) m.getKey();
            }
        }
        return clusterID;
    }
    
    /**
     * 
     * @return Hashmap <cheie,valoare> unde cheia reprezinta id-ul unui cluster
     * iar valoarea reprezinta id-ul cv-ului care este centrul de greutate
     * pentru clusterul respectiv
     * 
     */
    public HashMap<Integer, Integer> findAllCentersOfGravity(){
        
        Connection conn = null;
        Statement stmt = null; 
        ResultSet rs = null;
        String sql;
        
        int clusterID;
        HashMap<Integer, Integer> centersOfGravity = null;
        
        try {
            conn = Database.getConnection();

            stmt = conn.createStatement();
            
            sql = "Select distinct cluster_id from curriculumvitae";

            rs = stmt.executeQuery(sql);
            
            centersOfGravity = new HashMap<Integer, Integer>();

            while (rs.next()) {
                clusterID = rs.getInt(1);
                centersOfGravity.put(clusterID, this.findCenterOfGravity(clusterID));
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
        return centersOfGravity;
    }
    
    /**
     * @param ClusterID
     * @return Id-ul cv-ului care reprezinta centrul de greutate al clusterului
     * respectiv
     */
    public int findCenterOfGravity(int ClusterID) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        String sql;
        int min = 9999;
        int distance = 0;
        int cvID1, cvID2;
        int CenterOfGravityID = -1;
        Cv cv1, cv2;

        try {
            conn = Database.getConnection();

            stmt = conn.createStatement();

            sql = "Select id from curriculumvitae where cluster_id = " + ClusterID;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                cvID1 = rs.getInt(1);
                cv1 = cvController.getByID(cvID1);
                distance = 0;
                rs2 = stmt.executeQuery(sql);
                while (rs2.next()) {
                    cvID2 = rs2.getInt(1);
                    cv2 = cvController.getByID(cvID2);
                    if (cvID1 != cvID2) {
                        distance = (int) (distance + classifier.getSqrtDistance(classifier.getValuesForComputingGeneralDistance(cv1, cv2)));
                    }
                }
                rs2.close();
                if (min > distance) {
                    min = distance;
                    CenterOfGravityID = cvID1;
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return CenterOfGravityID;
    }
}
