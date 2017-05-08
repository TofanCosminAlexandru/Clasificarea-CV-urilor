/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Map;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana,
 * anul 2, grupa A1
 */
public class Classifier {

    public double[][] valuesForComputingGeneralDistance(Cv cv1, Cv cv2) { // obtine valorile pentru a calcula distanta dintre doua cv-uri in care 
        // toate atributele au aceeasi importanta
        double[] cv1Values = new double[7];
        double[] cv2Values = new double[7];

        cv1Values[0] = cv1.getAge();
        cv2Values[0] = cv2.getAge();

        cv1Values[1] = cv1.getExperienceYears();
        cv2Values[1] = cv2.getExperienceYears();

        cv1Values[2] = 0;
        cv2Values[2] = 0;
        Map<String, Integer> experienceCopy1 = cv1.getExperience();
        Map<String, Integer> experienceCopy2 = cv2.getExperience();
        experienceCopy1.entrySet().forEach((entry1) -> {
            String key1 = entry1.getKey();
            experienceCopy2.entrySet().forEach((entry2) -> {
                String key2 = entry2.getKey();
                if (key2.equals(key1)) {
                    cv1Values[2] += entry1.getValue();
                    cv2Values[2] += entry2.getValue();
                    experienceCopy1.put(entry1.getKey(), 0);
                    experienceCopy2.put(entry2.getKey(), 0);
                }
            });
        });
        experienceCopy1.entrySet().stream().filter((entry1) -> (entry1.getValue() != 0)).forEachOrdered((entry1) -> {
            cv1Values[2] += 2 * entry1.getValue();
        });
        experienceCopy2.entrySet().stream().filter((entry2) -> (entry2.getValue() != 0)).forEachOrdered((entry2) -> {
            cv2Values[2] += 2 * entry2.getValue();
        });

        cv1Values[3] = 0;
        cv2Values[3] = 0;
        if (cv1.getStudies()[0] == cv2.getStudies()[0]) {
            cv1Values[3] += cv1.getStudies()[1];
            cv2Values[3] += cv2.getStudies()[1];
        } else {
            if (cv1.getStudies()[0] == 0 && cv2.getStudies()[0] == 2) {
                cv1Values[3] += cv1.getStudies()[1];
                cv2Values[3] += 4 + cv2.getStudies()[1] + 2; // 4 - anii de liceu + valoarea de la licenta + 2 - pentru ca e pe o treapta mai sus
            }
            if (cv1.getStudies()[0] == 0 && cv2.getStudies()[0] == 4) {
                cv1Values[3] += cv1.getStudies()[1];
                cv2Values[3] += 4 + 4 + cv2.getStudies()[1] + 4;
            }
            if (cv1.getStudies()[0] == 0 && cv2.getStudies()[0] == 6) {
                cv1Values[3] += cv1.getStudies()[1];
                cv2Values[3] += 4 + 4 + 3 + cv2.getStudies()[1] + 6;
            }
            if (cv1.getStudies()[0] == 2 && cv2.getStudies()[0] == 4) {
                cv1Values[3] += 4 + cv1.getStudies()[1];
                cv2Values[3] += 4 + 4 + cv2.getStudies()[1] + 2;
            }
            if (cv1.getStudies()[0] == 2 && cv2.getStudies()[0] == 6) {
                cv1Values[3] += 4 + cv1.getStudies()[1];
                cv2Values[3] += 4 + 4 + 3 + cv2.getStudies()[1] + 4;
            }
            if (cv1.getStudies()[0] == 4 && cv2.getStudies()[0] == 6) {
                cv1Values[3] += 4 + 4 + cv1.getStudies()[1];
                cv2Values[3] += 4 + 4 + 3 + cv2.getStudies()[1] + 2;
            }
            if (cv1.getStudies()[0] == 2 && cv2.getStudies()[0] == 0) {
                cv2Values[3] += cv2.getStudies()[1];
                cv1Values[3] += 4 + cv1.getStudies()[1] + 2;
            }
            if (cv1.getStudies()[0] == 4 && cv2.getStudies()[0] == 0) {
                cv2Values[3] += cv2.getStudies()[1];
                cv1Values[3] += 4 + 4 + cv1.getStudies()[1] + 4;
            }
            if (cv1.getStudies()[0] == 6 && cv2.getStudies()[0] == 0) {
                cv2Values[3] += cv2.getStudies()[1];
                cv1Values[3] += 4 + 4 + 3 + cv1.getStudies()[1] + 6;
            }
            if (cv1.getStudies()[0] == 4 && cv2.getStudies()[0] == 2) {
                cv2Values[3] += 4 + cv2.getStudies()[1];
                cv1Values[3] += 4 + 4 + cv1.getStudies()[1] + 2;
            }
            if (cv1.getStudies()[0] == 6 && cv2.getStudies()[0] == 2) {
                cv2Values[3] += 4 + cv2.getStudies()[1];
                cv1Values[3] += 4 + 4 + 3 + cv1.getStudies()[1] + 4;
            }
            if (cv1.getStudies()[0] == 6 && cv2.getStudies()[0] == 4) {
                cv2Values[3] += 4 + 4 + cv2.getStudies()[1];
                cv1Values[3] += 4 + 4 + 3 + cv1.getStudies()[1] + 2;
            }
        }

        cv1Values[4] = cv1.getLanguages().length;
        cv2Values[4] = cv2.getLanguages().length;

        cv1Values[5] = cv1.getTechnicalSkills().length;
        cv2Values[5] = cv2.getTechnicalSkills().length;

        cv1Values[6] = cv1.getSocialSkills().length;
        cv2Values[6] = cv2.getSocialSkills().length;

        double cvValues[][] = new double[2][7];
        for (int i = 0; i < 7; i++) {
            cvValues[0][i] = cv1Values[i];
            cvValues[1][i] = cv2Values[i];
        }
        return cvValues;
    }

    public double sqrtDistance(double[][] values) { // calculeaza distanta folosind formula cu radicali: rad((a1-b1)^2 + (a2-b2)^2 + ...)
        for (int i = 0; i < 7; i++) {
            System.out.print(values[0][i] + " ");
            System.out.print(values[1][i] + " ");
            System.out.print("\n");
        }
        System.out.print("\n");

        double distance = 0;

        if (values[0][0] == values[1][0]) {
            distance += pow((values[0][0] - values[1][0]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 22), 2); // 22 - diferenta maxima dintre varste
        }

        if (values[0][1] == values[1][1]) {
            distance += pow((values[0][1] - values[1][1]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 20), 2);
        }

        if (values[0][2] == values[1][2]) {
            distance += pow((values[0][2] - values[1][2]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 20), 2);
        }

        if (values[0][3] == values[1][3]) {
            distance += pow((values[0][3] - values[1][3]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 18), 2);
        }

        if (values[0][4] == values[1][4]) {
            distance += pow((values[0][4] - values[1][4]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 5), 2);
        }

        if (values[0][5] == values[1][5]) {
            distance += pow((values[0][5] - values[1][5]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 10), 2);
        }

        if (values[0][6] == values[1][6]) {
            distance += pow((values[0][6] - values[1][6]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 10), 2);
        }

        distance = sqrt(distance) / 7;
        return distance;
    }

    public double absDistance(double[][] values) { // calculeaza distanta folosind formula cu module: |a1-b1| + |a2-b2| + ...
        double distance = 0;
        for (int i = 0; i < 7; i++) {
            distance += abs(values[0][i] - values[1][i]);
        }
        return distance / 105;
    }

    public double fraction1Distance(double[][] values) { // calculeaza distanta folosind prima formula cu fractii: |1/a1 - 1/b1| + |1/a2 - 1/b2| + ...
        double distance = 0;
        for (int i = 0; i < 7; i++) {
            distance += abs((1 / (values[0][i])) - (1 / (values[1][i])));
        }
        return distance;
    }

    public double fraction2Distance(double[][] values) { // calculeaza distanta folosind a doua formula cu fractii: |a1/(a1+1) - b1/(b1+1)| + |a2/(a2+1) - b2/(b2+1)| + ...
        double distance = 0;
        for (int i = 0; i < 7; i++) {
            distance += abs((values[0][i] / (1 + values[0][i])) - (values[1][i] / (1 + values[1][i])));
        }
        return distance;
    }
}
