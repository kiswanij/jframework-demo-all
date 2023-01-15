# Create Java Data Access to a Git repository
_Last updated: 2022-11-26_


This repository contains a _JKFramework-Data_ example which communicates with a Git repository as persistence layer.

## Prerequisites:
- JDK 17+ Installed
- A Git repository created.

## Project Main Contents 
The repository contains the following main contents: 
1. Maven project with [pom.xml](pom.xml)
  > :page_facing_up:*Note*: If you are using Eclipse, be sure to refresh your project (select your project→ right click→ Maven→ Update Project)
2. [Config file](src/main/resources/config.properties) which contains the Git repo information. 
3. [Java Model class](src/main/java/com/app/person/Model.java)    
4. [Data Access class](src/main/java/com/app/person/DataAccess.java) 
5. [Main java class](src/main/java/com/app/App.java)  
