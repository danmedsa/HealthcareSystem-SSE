# HealthcareSystem-SSE

# Tools
  - NetBeans 8.0.2
  - Glassfish Server 4.1.1
  
# Setup
  https://netbeans.org/kb/docs/websvc/jax-ws.html
  - Enabling Access to External Schema

  - http://stackoverflow.com/questions/21154400/unable-to-start-derby-database-from-netbeans-7-4
    - Do accepted answer point 2. to allow access for DB (grant access in java.policy file)

# Tutorials
###  Creating Functions and Project
  https://www.youtube.com/watch?v=BEYnlh78TQ4 - 
  https://netbeans.org/kb/docs/websvc/jax-ws.html
  - Create Web Service
  - Client 1: Java Application - for JAVA App
  
###  Creating Database:
  https://netbeans.org/kb/docs/ide/java-db.html
  
# Implementation
  1. Create New WebService Methods (https://youtu.be/BEYnlh78TQ4?t=175)
  2. Add Methods to Java App (https://youtu.be/BEYnlh78TQ4?t=335)
    - First right-click HealthcareSystemWS and hit 'Refresh...'

  3. Create the DB (https://netbeans.org/kb/docs/ide/java-db.html)
    - Set Name "HealthcareSystemDB"
    - Leave Username and Password fields empty
    - Create the User Table (https://netbeans.org/kb/docs/ide/java-db.html#sqlEditor)
       
       ``` CREATE TABLE "USERS" (
            "ID" INTEGER not null primary key,
            "FIRSTNAME" VARCHAR(30),
            "LASTNAME" VARCHAR(30),
            "USERNAME" VARCHAR(20),
            "PASSWORD" VARCHAR(20),
            "EMAIL" VARCHAR(60),
            "ROLE" INTEGER
        ); ```
        
    - Insert Data (https://netbeans.org/kb/docs/ide/java-db.html#usesqleditor)
    
    
# How to Run
  - Right-click HealthcareSystemWSApplication and select 'Deploy'
  
  - Go to Services Tab, next to Projects
    1. Righ-Click jdbc:derby://localhost:1527/HealthcareSystemDB [ on APP] and click 'Connect' if not connected
    2. Input Data to DB if not done before
 
  
  JAVA:
  - Right-Click HealthcareSystemApplication and select 'Run'
