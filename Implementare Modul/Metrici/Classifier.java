/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvclassification;

import daoOracle.CvController;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mihalachi Bogdan-Marian, Balan Sabin-Marian, Ababei Bianca-Georgiana,
 * Ioja Petru-Alexandru, anul 2, grupa A1
 */
public class Classifier {

    public double[][] getValuesForComputingGeneralDistance(Cv cv1, Cv cv2) { // obtine valorile pentru a calcula distanta dintre doua cv-uri in care 
        // toate atributele au aceeasi importanta
        // cvValues[0] - varsta, cvValues[1] - experienta totala, cvValues[2] - experienta pe domenii, cvValues[3] - studiile
        // cvValues[4] - skill-urile tehnice, cvValues[5] - soft skill-urile

        double[] cv1Values = new double[6];
        double[] cv2Values = new double[6];

        cv1Values[0] = cv1.getAge();
        cv2Values[0] = cv2.getAge();

        cv1Values[1] = cv1.getExperienceYears();
        cv2Values[1] = cv2.getExperienceYears();

        cv1Values[2] = 0;
        cv2Values[2] = 0;
        Map<String, Integer> experienceCopy1 = new HashMap<>();
        Map<String, Integer> experienceCopy2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry1 : cv1.getExperience().entrySet()) {
            experienceCopy1.put(entry1.getKey(), entry1.getValue());
        }
        for (Map.Entry<String, Integer> entry2 : cv2.getExperience().entrySet()) {
            experienceCopy2.put(entry2.getKey(), entry2.getValue());
        }
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

        cv1Values[4] = 0;
        for (int i = 0; i < cv1.getTechnicalSkills().length; i++) {
            if (cv1.getTechnicalSkills()[i] != null) {
                cv1Values[4]++;
            }
        }
        cv2Values[4] = 0;
        for (int i = 0; i < cv2.getTechnicalSkills().length; i++) {
            if (cv2.getTechnicalSkills()[i] != null) {
                cv2Values[4]++;
            }
        }

        cv1Values[5] = 0;
        for (int i = 0; i < cv1.getSoftSkills().length; i++) {
            if (cv1.getSoftSkills()[i] != null) {
                cv1Values[5]++;
            }
        }
        cv2Values[5] = 0;
        for (int i = 0; i < cv2.getSoftSkills().length; i++) {
            if (cv2.getSoftSkills()[i] != null) {
                cv2Values[5]++;
            }
        }

        double cvValues[][] = new double[2][6];
        for (int i = 0; i < 6; i++) {
            cvValues[0][i] = cv1Values[i];
            cvValues[1][i] = cv2Values[i];
        }
        return cvValues;
    }

    /* ****************************************************************************************************************************************** */
    public double[][] modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge(Cv cv1, Cv cv2, int minAge, int maxAge, double[][] cvValues) {
        // minAge, maxAge - capetele intervalului in care se doreste a fi varsta persoanelor cautate
        if (cv1.getAge() >= minAge && cv1.getAge() <= maxAge && cv2.getAge() >= minAge && cv2.getAge() <= maxAge) {
            return cvValues;
        } else if ((cv1.getAge() >= minAge && cv1.getAge() <= maxAge) || (cv2.getAge() >= minAge && cv2.getAge() <= maxAge)) {
            if (cv1.getAge() > cv2.getAge()) {
                cvValues[0][0] += 20; // crestem diferenta dintre cv-uri
            } else {
                cvValues[1][0] += 20;
            }
            return cvValues;
        }
        return cvValues;
    }

    public double[][] modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience(Cv cv1, Cv cv2, int years, double cvValues[][]) {
        // years - valoarea minima a anilor de experienta care se doreste a fi detinuta de persoana
        if (cv1.getExperienceYears() >= years && cv2.getExperienceYears() >= years) {
            return cvValues;
        } else if (cv1.getExperienceYears() >= years || cv2.getExperienceYears() >= years) {
            if (cv1.getExperienceYears() > cv2.getExperienceYears()) {
                cvValues[0][1] += 20; // crestem diferenta dintre cv-uri
            } else {
                cvValues[1][1] += 20;
            }
            return cvValues;
        }
        return cvValues;
    }

    public double[][] modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience(Cv cv1, Cv cv2, Map<String, Integer> experience, double cvValues[][]) {
        // experience - cam cati ani de experineta si in ce domenii se doreste a avea persoana
        for (Map.Entry<String, Integer> entry : experience.entrySet()) {
            if (cv1.getExperience().containsKey(entry.getKey()) && cv2.getExperience().containsKey(entry.getKey())) {
                if (cv1.getExperience().get(entry.getKey()) >= entry.getValue() && cv2.getExperience().get(entry.getKey()) >= entry.getValue()) {
                } else if (cv1.getExperience().get(entry.getKey()) >= entry.getValue()) {
                    cvValues[0][2] += (cv1.getExperience().get(entry.getKey()) - entry.getValue()) * 2 + 1;
                } else if (cv2.getExperience().get(entry.getKey()) >= entry.getValue()) {
                    cvValues[1][2] += (cv2.getExperience().get(entry.getKey()) - entry.getValue()) * 2 + 1;
                }
            } else if (cv1.getExperience().containsKey(entry.getKey())) {
                if (cv1.getExperience().get(entry.getKey()) >= entry.getValue()) {
                    cvValues[0][2] += cv1.getExperience().get(entry.getKey()) * 3;
                } else {
                    cvValues[0][2] += 3;
                }
            } else if (cv2.getExperience().containsKey(entry.getKey())) {
                if (cv2.getExperience().get(entry.getKey()) >= entry.getValue()) {
                    cvValues[1][2] += cv2.getExperience().get(entry.getKey()) * 3;
                } else {
                    cvValues[1][2] += 3;
                }
            }
        }
        return cvValues;
    }

    public double[][] modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies(Cv cv1, Cv cv2, int studyLevel, int years, double cvValues[][]) {
        // studyLevel - 0 - liceu, 2 - licenta, 4 - master, 6 - doctorat, years - numarul minim de ani asteptat a-l avea la respectivul nivel
        if ((cv1.getStudies()[0] > studyLevel && cv2.getStudies()[0] > studyLevel) || (cv2.getStudies()[0] < studyLevel && cv2.getStudies()[0] < studyLevel)) {
        } else if (cv1.getStudies()[0] == studyLevel && cv2.getStudies()[0] == studyLevel) {
            if (cv1.getStudies()[1] >= years && cv2.getStudies()[2] >= years) {
            } else if (cv1.getStudies()[1] >= years) {
                cvValues[0][3] += 20;
            } else if (cv2.getStudies()[1] >= years) {
                cvValues[1][3] += 20;
            }
        } else if (cv1.getStudies()[0] >= studyLevel) {
            if (cv1.getStudies()[1] >= years) {
                cvValues[0][3] += 20;
            } else {
                cvValues[0][3] += 10;
            }
        } else if (cv2.getStudies()[0] >= studyLevel) {
            if (cv2.getStudies()[1] >= years) {
                cvValues[1][3] += 20;
            } else {
                cvValues[1][3] += 10;
            }
        }
        return cvValues;
    }

    public double[][] modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTechnicalSkills(Cv cv1, Cv cv2, String[] technicalSkills, double cvValues[][]) {
        // languages - se prefera persoane care cunosc aceste limbi
        for (String technicalSkill : technicalSkills) {
            for (int i = 0; i < cv1.getTechnicalSkills().length; i++) {
                if (cv1.getTechnicalSkills()[i].equals(technicalSkill)) {
                    cvValues[0][4] += 10;
                }
            }
            for (int i = 0; i < cv2.getTechnicalSkills().length; i++) {
                if (cv2.getTechnicalSkills()[i].equals(technicalSkill)) {
                    cvValues[1][4] += 10;
                }
            }
        }
        return cvValues;
    }

    public double[][] modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills(Cv cv1, Cv cv2, String[] softSkills, double cvValues[][]) {
        // softSkills - se prefera persoane care poseda aceste soft skill-uri
        for (String softSkill : softSkills) {
            for (int i = 0; i < cv1.getSoftSkills().length; i++) {
                if (cv1.getSoftSkills()[i].equals(softSkill)) {
                    cvValues[0][5] += 10;
                }
            }
            for (int i = 0; i < cv2.getSoftSkills().length; i++) {
                if (cv2.getSoftSkills()[i].equals(softSkill)) {
                    cvValues[1][5] += 10;
                }
            }
        }
        return cvValues;
    }

    /* ****************************************************************************************************************************************** */
    public double getSqrtDistance(int idCv1, int idCv2, int ok1, int minAge, int maxAge, int ok2, int totalYears, int ok3, Map<String, Integer> experience,
            int ok4, int studyLevel, int years, int ok5, String[] technicalSkills, int ok6, String[] softSkills) { // calculeaza distanta folosind formula cu radicali: rad((a1-b1)^2 + (a2-b2)^2 + ...)

        Cv cv1 = new CvController().getByID(idCv1);
        Cv cv2 = new CvController().getByID(idCv2);

        double[][] values = getValuesForComputingGeneralDistance(cv1, cv2);
        if (ok1 == 1) {
            values = modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfAge(cv1, cv2, minAge, maxAge, values);
        }
        if (ok2 == 1) {
            values = modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTotalExperience(cv1, cv2, totalYears, values);
        }
        if (ok3 == 1) {
            values = modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfDomainExperience(cv1, cv2, experience, values);
        }
        if (ok4 == 1) {
            values = modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfStudies(cv1, cv2, studyLevel, years, values);
        }
        if (ok5 == 1) {
            values = modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfTechnicalSkills(cv1, cv2, technicalSkills, values);
        }
        if (ok6 == 1) {
            values = modifyValuesForComputingDistanceWithEmphasisOnTheImportanceOfSoftSkills(cv1, cv2, softSkills, values);
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(values[0][i] + " ");
            System.out.print(values[1][i] + " ");
            System.out.print("\n");
        }
        System.out.print("\n");

        double distance = 0;

        if (values[0][0] == values[1][0]) {
            distance += pow((values[0][0] - values[1][0]), 2); // 0
        } else {
            distance += pow(((values[0][0] - values[1][0]) / 25), 2); // 22 - diferenta maxima dintre varste
        }

        if (values[0][1] == values[1][1]) {
            distance += pow((values[0][1] - values[1][1]), 2); // 0
        } else {
            distance += pow(((values[0][1] - values[1][1]) / 20), 2);
        }

        if (values[0][2] == values[1][2]) {
            distance += pow((values[0][2] - values[1][2]), 2); // 0
        } else {
            distance += pow(((values[0][2] - values[1][2]) / 20), 2);
        }

        if (values[0][3] == values[1][3]) {
            distance += pow((values[0][3] - values[1][3]), 2); // 0
        } else {
            distance += pow(((values[0][3] - values[1][3]) / 18), 2);
        }

        if (values[0][4] == values[1][4]) {
            distance += pow((values[0][4] - values[1][4]), 2); // 0
        } else {
            distance += pow(((values[0][4] - values[1][4]) / 20), 2);
        }

        if (values[0][5] == values[1][5]) {
            distance += pow((values[0][5] - values[1][5]), 2); // 0
        } else {
            distance += pow(((values[0][5] - values[1][5]) / 20), 2);
        }

        distance = sqrt(distance) / 6;
        return distance;
    }

    /*public double getAbsDistance(double[][] values) { // calculeaza distanta folosind formula cu module: |a1-b1| + |a2-b2| + ...
        double distance = 0;
        for (int i = 0; i < 6; i++) {
            distance += abs(values[0][i] - values[1][i]);
        }
        return distance / 95;
    }

    public double getFraction1Distance(double[][] values) { // calculeaza distanta folosind prima formula cu fractii: |1/a1 - 1/b1| + |1/a2 - 1/b2| + ...
        double distance = 0;
        for (int i = 0; i < 6; i++) {
            distance += abs((1 / (values[0][i])) - (1 / (values[1][i])));
        }
        return distance;
    }

    public double getFraction2Distance(double[][] values) { // calculeaza distanta folosind a doua formula cu fractii: |a1/(a1+1) - b1/(b1+1)| + |a2/(a2+1) - b2/(b2+1)| + ...
        double distance = 0;
        for (int i = 0; i < 6; i++) {
            distance += abs((values[0][i] / (1 + values[0][i])) - (values[1][i] / (1 + values[1][i])));
        }
        return distance;
    }*/
}
