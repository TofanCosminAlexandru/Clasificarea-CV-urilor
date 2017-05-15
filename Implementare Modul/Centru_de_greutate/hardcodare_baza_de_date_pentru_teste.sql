DROP TABLE CurriculumVitae;
/
DROP TABLE Experience;
/
DROP TABLE Studies;
/
DROP TABLE LanguageSkills;
/
DROP TABLE Hobbies;
/
DROP TABLE SoftSkills;
/
DROP TABLE Technical_skills;
/
DROP TABLE Social_skills;
/
DROP TABLE CLUSTERS;
/

CREATE TABLE CurriculumVitae(
  ID NUMBER primary key,
  CLUSTER_ID NUMBER,
  NAME VARCHAR2(256),
  DATE_OF_BIRTH DATE,
  ADDRESS VARCHAR2(256),
  PHONE_NUMBER NUMBER(10),
  EMAIL VARCHAR2(256),
  EXPERIENCE_YEARS NUMBER,
  IDEAL_JOB VARCHAR2(256),
  EXPERIENCE_ID NUMBER,
  STUDIES_ID NUMBER,
  LANGUAGE_ID NUMBER,
  HOBBY_ID NUMBER,
  SOFTSKILL_ID NUMBER
);
/

CREATE TABLE Experience(
  EXPERIENCE_ID NUMBER not null,
  JOB_TITLE VARCHAR2(256),
  EXPERIENCE_YEARS NUMBER
);
/

CREATE TABLE Studies(
  STUDIES_ID NUMBER not null,
--  0 - LICEU; 
--  2 - LICENTA
--  4 - MASTER
--  6 - DOCTORAT
  CERTIFICATE NUMBER,
  STUDY_YEARS NUMBER
);
/

CREATE TABLE LanguageSkills(
  LANGUAGE_ID NUMBER not null,
  LANGUAGE CLOB
);
/

CREATE TABLE Hobbies(
  HOBBY_ID NUMBER not null,
  HOBBY CLOB
);
/

CREATE TABLE SoftSkills(
  SOFTSKILL_ID NUMBER not null,
  TECHNICAL_SKILL_ID NUMBER,
  SOCIAL_SKILL_ID NUMBER
);
/

CREATE TABLE TECHNICAL_SKILLS(
   TECHNICAL_SKILL_ID NUMBER not null,
   SKILL CLOB
);
/

CREATE TABLE SOCIAL_SKILLS(
  SOCIAL_SKILL_ID NUMBER not null,
  SKILL CLOB
);
/

CREATE TABLE CLUSTERS(
  CLUSTER_ID NUMBER not null,
  GRAVITY_CENTER_ID NUMBER
);
/

insert into CurriculumVitae values (1,2,'Ghise Ioan',TO_DATE('29/12/1979', 'DD/MM/YYYY'),
'Faculty Of Computer Science, General Berthelot 16 700483IAªI, Romania',
'0742112712','adria@info.uaic.ro',16,'Researcher and Analyst Programmer',1,1,1,1,1);

insert into Experience values (1,'Research Assistant',1 );
insert into Experience values (1,'Researcher and Analyst Programmer',3);
insert into Experience values (1,'PreparatorProfessor',2);
insert into Experience values (1,'Analyst Programmer',1);
insert into Experience values (1,'Assistant Professor',2);
insert into Experience values (1,'Analyst Programmer',1);
insert into Experience values (1,'Lecturer',2);
insert into Experience values (1,'Associate Professor',4);

insert into STUDIES values (1,6,2);

insert into LANGUAGESKILLS values (1, 'Engleza Franceza');

insert into SoftSkills values (1,1,1);

insert into TECHNICAL_SKILLS values (1, 'C/C++ Java Pascal SQL Delphi Visual C++ C#');

insert into HOBBIES values (1, 'Fotbal Baschet Muzica RC');

insert into SOCIAL_SKILLS values (1,'Distributed_Computing Computer_Networks');






insert into CurriculumVitae values (2,2,'Alex Xie',TO_DATE('29/12/1980', 'DD/MM/YYYY'),
'Milpitas, CA - CA',
'0','https://www.indeed.com/r/Alex-Xie',10,'iOS Junior Developer',2,2,2,2,2);

insert into Experience values (2,'Objective-C',4 );
insert into Experience values (2,'Swift',1);
insert into Experience values (2,'SDK development',1);
insert into Experience values (2,'Git',3);
insert into Experience values (2,'TDD',1);
insert into Experience values (2,'Agile Scrum',3);
insert into Experience values (2,'Auto Layout',3);
insert into Experience values (2,'Core Data',1);
insert into Experience values (2,'iOS Developer ',1);

insert into STUDIES values (2,4,3);

insert into LANGUAGESKILLS values (2, 'Engleza Franceza');

insert into SoftSkills values (2,2,2);

insert into TECHNICAL_SKILLS values (2, 'Objective-C Swift SDK development Git TDD AgileScrum AutoLayout Core Data XCTest');

insert into HOBBIES values (2, 'Fotbal Baschet Muzica RC');

insert into SOCIAL_SKILLS values (2,'Bachelor_of_Engineer_in_Civil_Engineering Computer_Networks');





insert into CurriculumVitae values (3,2,'Floris Master',TO_DATE('23/12/1994', 'DD/MM/YYYY'),
'Milpitas, CA - CA',
'0','https://www.indeed.com/r/Alex-Xie',10,'Student',3,3,3,3,3);

insert into Experience values (3,'Objective-C', 2);
insert into Experience values (3,'Git',1);
insert into Experience values (3,'Java',1);

insert into STUDIES values (3,3,3);

insert into LANGUAGESKILLS values (3, 'Engleza');

insert into SoftSkills values (3,3,3);

insert into TECHNICAL_SKILLS values (3, 'Objective-C Git Java');

insert into HOBBIES values (3, 'Flotari');

insert into SOCIAL_SKILLS values (3,'Agatatul_gagicilor');






insert into CurriculumVitae values (4,2,'Liviustien',TO_DATE('23/12/1994', 'DD/MM/YYYY'),
'Milpitas, CA - CA',
'0','https://www.indeed.com/r/Alex-Xie',10,'Student',4,4,4,4,4);

insert into Experience values (4,'C++', 2);
insert into Experience values (4,'Git',1);
insert into Experience values (4,'Java',1);
insert into Experience values (4,'CS',4);
insert into Experience values (4,'SQL',1);

insert into STUDIES values (4,4,4);

insert into LANGUAGESKILLS values (4, 'Engleza');

insert into SoftSkills values (4,4,4);

insert into TECHNICAL_SKILLS values (4, 'Tastatul_cu_ochii_inchisi Java C++ Git');

insert into HOBBIES values (4, 'CSGO');

insert into SOCIAL_SKILLS values (4,'Agatatul_gagicilor');





insert into CurriculumVitae values (5,2,'Alex Xie2',TO_DATE('29/12/1980', 'DD/MM/YYYY'),
'Milpitas, CA - CA',
'0','https://www.indeed.com/r/Alex-Xie',10,'iOS Junior Developer',5,5,5,5,5);

insert into Experience values (5,'Objective-C',4 );
insert into Experience values (5,'Swift',1);
insert into Experience values (5,'SDK development',1);
insert into Experience values (5,'Git',3);
insert into Experience values (5,'TDD',1);
insert into Experience values (5,'Agile Scrum',3);
insert into Experience values (5,'Auto Layout',3);
insert into Experience values (5,'Core Data',1);
insert into Experience values (5,'iOS Developer ',1);

insert into STUDIES values (5,4,3);

insert into LANGUAGESKILLS values (5, 'Engleza Franceza');

insert into SoftSkills values (5,5,5);

insert into TECHNICAL_SKILLS values (5, 'Objective-C Swift SDK development Git TDD AgileScrum AutoLayout Core Data XCTest');

insert into HOBBIES values (5, 'Fotbal Baschet Muzica RC');

insert into SOCIAL_SKILLS values (5,'Bachelor_of_Engineer_in_Civil_Engineering Computer_Networks');








insert into CurriculumVitae values (6,0,'Mircea Radu',TO_DATE('29/12/1980', 'DD/MM/YYYY'),
'Milpitas, CA - CA',
'0','https://www.indeed.com/r/Alex-Xie',10,'Presedinte',5,5,5,5,5);

insert into Experience values (6,'Objective-C',4 );
insert into Experience values (6,'Swift',1);
insert into Experience values (6,'Researcher and Analyst Programmer',3);
insert into Experience values (6,'PreparatorProfessor',2);
insert into Experience values (6,'Analyst Programmer',1);
insert into Experience values (6,'iOS Developer ',1);

insert into STUDIES values (6,4,4);

insert into LANGUAGESKILLS values (6, 'Engleza GERMANA');

insert into SoftSkills values (6,6,6);

insert into TECHNICAL_SKILLS values (6, 'Objective-C Swift Researcher and Analyst Programmer PreparatorProfessor iOS Developer');

insert into HOBBIES values (6, 'Culesul florilor');

insert into SOCIAL_SKILLS values (6,'Bachelor_of_Engineer_in_Civil_Engineering Computer_Networks');




insert into CurriculumVitae values (7,0,'Bibi bubu',TO_DATE('29/12/1979', 'DD/MM/YYYY'),
'Faculty Of Computer Science, General Berthelot 16 700483IAªI, Romania',
'0742162712','adria@info.uaic.ro',16,'Smecher in Android',7,7,7,7,7);

insert into Experience values (7,'Android',1 );
insert into Experience values (7,'IOS',3);
insert into Experience values (7,'JAVA',3);

insert into STUDIES values (7,6,2);

insert into LANGUAGESKILLS values (7, 'Engleza Franceza');

insert into SoftSkills values (7,7,7);

insert into TECHNICAL_SKILLS values (7, 'Android, Java, IOS');

insert into HOBBIES values (7, 'Fotbal Baschet Muzica RC');

insert into SOCIAL_SKILLS values (7,'Distributed_Computing Computer_Networks');



insert into CurriculumVitae values (8,0,'Liviu Profesionistu',TO_DATE('29/12/1979', 'DD/MM/YYYY'),
'Faculty Of Computer Science, General Berthelot 16 700483IAªI, Romania',
'0792112712','adria@info.uaic.ro',16,'CS:GO PRofessional pro player',8,8,8,8,8);

insert into Experience values (8,'CS:GO',1 );
insert into Experience values (8,'MARIO',3);
insert into Experience values (8,'Java',2);
insert into Experience values (8,'Analyst Programmer',1);
insert into Experience values (8,'Assistant Professor',2);
insert into Experience values (8,'Analyst Programmer',1);
insert into Experience values (8,'Lecturer',2);
insert into Experience values (8,'Associate Professor',4);

insert into STUDIES values (8,6,2);

insert into LANGUAGESKILLS values (8, 'Engleza Franceza');

insert into SoftSkills values (8,8,8);

insert into TECHNICAL_SKILLS values (8, 'Java, C, CS:GO');

insert into HOBBIES values (8, 'Fotbal Baschet Metin2 Workout');

insert into SOCIAL_SKILLS values (8,'Distributed_Computing Computer_Networks');




insert into CurriculumVitae values (9,0,'Florian Barbarian',TO_DATE('29/12/1979', 'DD/MM/YYYY'),
'Faculty Of Computer Science, General Berthelot 16 700483IAªI, Romania',
'0748112712','adria@info.uaic.ro',16,'Esport pro player',9,9,9,9,9);

insert into Experience values (9,'League of Legends',1 );
insert into Experience values (9,'World of Tanks',3);
insert into Experience values (9,'PreparatorProfessor',2);

insert into STUDIES values (9,6,2);

insert into LANGUAGESKILLS values (9, 'Engleza Franceza Spaniola');

insert into SoftSkills values (9,9,9);

insert into TECHNICAL_SKILLS values (9, 'C/C++ Java C#');

insert into HOBBIES values (9, 'Fotbal Masini');

insert into SOCIAL_SKILLS values (9,'Distributed_Computing Computer_Networks');



insert into CurriculumVitae values (10,0,'Tractor Vasile',TO_DATE('29/12/1979', 'DD/MM/YYYY'),
'Faculty Of Computer Science, General Berthelot 16 700483IAªI, Romania',
'0742182712','adria@info.uaic.ro',16,'Researcher and Analyst Programmer',10,10,10,10,10);

insert into Experience values (10,'Tractor',1 );
insert into Experience values (10,'Utilaje grele',3);
insert into Experience values (10,'Camioane',2);


insert into STUDIES values (10,6,2);

insert into LANGUAGESKILLS values (10, 'Romana');

insert into SoftSkills values (10,10,10);

insert into TECHNICAL_SKILLS values (10, 'Maneta Schimbator');

insert into HOBBIES values (10, 'Iesit cu baietii');

insert into SOCIAL_SKILLS values (10,'Distributed_Computing Computer_Networks');