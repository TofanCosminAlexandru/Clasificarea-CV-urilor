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

CREATE TABLE CurriculumVitae(
  ID NUMBER primary key,
  CLUSTER_ID VARCHAR2(3),
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

insert into CurriculumVitae values (1,0,'Ghise Ioan',TO_DATE('29/12/1979', 'DD/MM/YYYY'),
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



