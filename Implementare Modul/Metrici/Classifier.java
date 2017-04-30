/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Map;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana,
 * anul 2, grupa A1
 */
public class Classifier {

    public double distance(Cv cv1, Cv cv2) {
        double[] cv1Values = new double[6];
        double[] cv2Values = new double[6];
        double distance = 0;

        cv1Values[0] = 0;
        cv2Values[0] = 0;
        for (Map.Entry<String, Integer> entry : cv1.getExperience().entrySet()) {
            String key = entry.getKey();
            int value1 = entry.getValue();
            int value2 = cv2.getExperience().get(key);
            if (value1 != 0 && value2 != 0) {
                cv1Values[0] += value1;
                cv2Values[0] += value2;
            }
            if (value1 != 0 && value2 == 0) {
                cv1Values[0] += 2 * value1;
            }
            if (value1 == 0 && value2 != 0) {
                cv2Values[0] += 2 * value2;
            }
        }

        cv1Values[1] = 0;
        cv2Values[1] = 0;
        for (Map.Entry<String, Integer> entry : cv1.getProgrammingLanguages().entrySet()) {
            String key = entry.getKey();
            int value1 = entry.getValue();
            int value2 = cv2.getProgrammingLanguages().get(key);
            cv1Values[1] += value1;
            cv2Values[1] += value2;
        }

        cv1Values[2] = cv1.getAge();
        cv2Values[2] = cv2.getAge();

        cv1Values[3] = 0;
        cv2Values[3] = 0;
        for (Map.Entry<String, Integer> entry : cv1.getPersonalQualities().entrySet()) {
            String key = entry.getKey();
            int value1 = entry.getValue();
            int value2 = cv2.getPersonalQualities().get(key);
            cv1Values[3] += value1;
            cv2Values[3] += value2;
        }

        cv1Values[4] = cv1.getProjects();
        cv2Values[4] = cv2.getProjects();

        cv1Values[5] = 0;
        cv2Values[5] = 0;
        for (Map.Entry<String, Integer> entry : cv1.getLanguages().entrySet()) {
            String key = entry.getKey();
            int value1 = entry.getValue();
            int value2 = cv2.getLanguages().get(key);
            cv1Values[5] += value1;
            cv2Values[5] += value2;
        }

        for (int i = 0; i < 6; i++) {
            distance += pow((cv1Values[i] - cv2Values[i]), 2);
        }
        distance = sqrt(distance);
        return distance;
    }
}
