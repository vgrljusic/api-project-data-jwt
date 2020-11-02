# api-project-data-jwt
Java Spring boot Rest API with example PostgreSQL database using JWT authentication

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup and Installation](#setup-and-installation)
* [Code Example](#code-examples)
* [Screenshots](#screenshots)
* [Features](#features)
* [Contact](#contact)

## General info
Add more general information about project. What the purpose of the project is? Motivation?

## Technologies
* Java - version 11.0.7
* Spring Boot - version 2.3.2
* Spring Data JPA - version 2.4.0
* Spring Security - version 5.4.1
* JSON Web Tokens - version 0.9.1
* PostgreSQL - version 13.0.1
* Apache Maven - version 3.6.0

## Screenshots
![Example screenshot](./img/screenshot.png)

## Setup and Installation
Describe how to install / setup your local environement / add link to demo version.

1. #### Download or clone the repository from GitHub

```
git clone https://github.com/vgrljusic/api-project-data-jwt.git
cd api-project-data-jwt
```

2. #### Install required applications

```
sudo apt update
sudo snap install postman
sudo apt install postgresql postgresql-contrib
```

3. #### Setup database project

In the root application directory (api-project-data-jwt), SQL script file (project_setup.sql) is present for creating database

##### Run the script using psql client: 

```
cd Documents/api-project-data-jwt
psql -U postgres --file project_setup.sql
# promt to enter postgres user password (usually password is postgres)
```

4. #### (Optional) Update database configurations in application.properties

If you have modified the SQL script file for creating database with some different username and password, update the src/main/resources/application.properties file accordingly:

```
spring.jpa.hibernate.ddl-auto=create #for first time running MUST be set to create, for every consecutive time set to update
spring.datasource.url=jdbc:postgresql://localhost:5432/project_db
spring.datasource.username=postgres
spring.datasource.password=postgres

```

5. #### Run the spring boot application

```
cd Documents/api-project-data-jwt
mvn clean install
java -jar target/api-project-data-0.0.1-SNAPSHOT.jar
```

this runs at port 8080 and hence all enpoints can be accessed starting from http://localhost:8080

6. #### Create database objects

In the root application directory (api-project-data-jwt), SQL script file (project_db.sql) is present for populating database

##### Run the script using psql client: 

```
cd Documents/api-project-data-jwt
psql -U postgres --file project_db.sql
# promt to enter postgres user password (usually password is postgres)
```

## Code Examples
Show examples of usage:
`put-your-code-here`


## Features
List of features ready and TODOs for future development
* Awesome feature 1
* Awesome feature 2
* Awesome feature 3

To-do list:
* Wow improvement to be done 1
* Wow improvement to be done 2

## Contact
Created by [@vgrljusic] - feel free to contact me!
