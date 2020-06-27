# personalityTest
Personality Test which includes multiple questions to analyze person's character and community's common behaviour.
NOTE: Project also contains result page to visualize and edit from page. However case study  requirements does not contain role based authorization, so it is not implemented and there is no login/authorize option for admin roles. Because of that every user can access results and manupilate data. In reality it should be implemented (by using Spring Security etc.).
Moreover in this project configuration datas are kept in application which is not a good habit. They should be externalized to Zookeper and/or Redis etc. 


---Technology Stack---

Java / Spring Framework(Boot)  
Hibernate / Spring Data JPA
Thymeleaf
Maven
Javascript
Bootstrap/Html/Css
Tomcat

----- DATABASE -------
Mongo DB Cloud

Credentials : 

username: egemenSofttech
password: egemenSofttech

spring.data.mongodb.uri=mongodb+srv://egemenSofttech:egemenSofttech@cluster0-l1ykd.mongodb.net/test?retryWrites=true
spring.data.mongodb.database=test


---------SUMMARY-------------

Project aims to collect user's personal data for survey. Users can fill a form by giving their personal information (name,surname,age,email) or anonymously.

User data is collected in Mongo DB Cloud Database. Questions and answers are mapped to integer values for increase speed of queries and each time while application is starting this mapped values are written to another document (Question) to perform aggregate querries on Mongo DB.

Project consists of 3 main page which are 
-Welcome Page
-Survey Page
-Results Page // This page should be seen by just from Admin role users. But in this project security and authentication/authorization part is not implemented. So every user can access this part.

