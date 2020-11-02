# api-project-data-jwt
Java Spring boot Rest API with example PostgreSQL database using JWT authentication

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup and Installation](#setup-and-installation)
* [How to use](#how-to-use)
* [Code Example of usage](#code-examples-of-usage)
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
* Hibernate ORM - version 5.4.18

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
# promt to enter postgres user password (usuall password is postgres)
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

## How to use

Failed authentication
![image](https://user-images.githubusercontent.com/52451893/97893829-11416200-1d32-11eb-87d4-e3dcbca12951.png)

Getting JWT token
![image](https://user-images.githubusercontent.com/52451893/97894613-01764d80-1d33-11eb-979a-b7444896b520.png)

Providing JWT token
![image](https://user-images.githubusercontent.com/52451893/97894218-8d3baa00-1d32-11eb-9866-e7ee6956173a.png)

Geting shops
![image](https://user-images.githubusercontent.com/52451893/97894794-38e4fa00-1d33-11eb-9020-45788c2971fe.png)

Geting items
![image](https://user-images.githubusercontent.com/52451893/97894839-47cbac80-1d33-11eb-9351-f5b1f1806990.png)

Posting items
![image](https://user-images.githubusercontent.com/52451893/97894896-5d40d680-1d33-11eb-94ad-6c3d61e1f3a1.png)

Puting items
![image](https://user-images.githubusercontent.com/52451893/97894958-70ec3d00-1d33-11eb-9545-ca83d36dac3b.png)

Deleting customers
![image](https://user-images.githubusercontent.com/52451893/97895018-82cde000-1d33-11eb-99c5-a2cf86f7bb3c.png)

## Code Examples of usage:
Use SQL querys to calculate distance bettween shop and customers

```
SELECT ST_Distance(
ST_GeomFromText((SELECT geom FROM shop WHERE id = 'Instar'), 3765),
ST_GeomFromText((SELECT geom FROM customer WHERE id = 'Valentino Grljušić'), 3765)
);
```

## Features
List of features ready 
* Awesome feature 1
* Awesome feature 2
* Awesome feature 3

To-do list: for future development
* Wow improvement to be done 1
* Wow improvement to be done 2

## Contact
Created by [@vgrljusic](linkedin.com/in/vgrljusic) - feel free to contact me!
