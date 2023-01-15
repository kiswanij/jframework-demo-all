# JKFramework Data JDBC Example
_Last updated: 2022-11-26_


This repository contains a _JKFramework-Data_ example which execute SQL statement son locally created H2 database.

## Prerequisites:
- JDK 17+ Installed

## Usage:
1. Clone the repository
2. Import as Java project into your favorite IDE (we use _SpringToolSuite_ and _Eclipse-JavaEE_)
3. Run `App` class.

## Project Main Contents 
The repository  contains the following main contents: 
1. Maven project with [pom.xml](pom.xml)
  > :page_facing_up:*Note*: If you are using Eclipse, be sure to refresh your project (select your project→ right click→ Maven→ Update Project)
2. [Config file](src/main/resources/config.properties) which contains the database config.
  >:page_facing: To change the database engine, enable the proper config in the config file.
3. [Account model](src/main/java/com/app/models/Account.java) which include fields names that are the same names
of fields in the database
3. [Account2 model](src/main/java/com/app/models/Account2.java) which contains fields names that are DIFFERENT from database field names.   
8. [App class](src/main/java/com/app/App.java)  

