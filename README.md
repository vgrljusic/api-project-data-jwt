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
This Rest API is developed using Java language and Spring boot framework. The motivatoin for building this project was to fruther deepen understanding of Spring framework as well as use case implementations of Java language. In this project Rest API is programed to create, read, update and delete (CRUD) relational database. Database contains number of Tech & Electronics shops, their loyal customers and customer's items. While running jar file for first time whole database structure is being initialized using JPA and Hibernate. It also uses external PostgreSQL database to fetch some prerecorded values. To top it all off in order to authenticate user needs to provide JWT token generated by providing defualt username and password. All in all the challenge and the process were fruitful and I am looking forward for the next one.  

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

1. #### Download or clone the repository from GitHub

```
git clone https://github.com/vgrljusic/api-project-data-jwt.git
cd api-project-data-jwt
```

2. #### Install required programs

In order to follow along user needs to have PostgreSQL and preferably Postman. Bellow are short terminal lines for easy installation.
```
sudo apt update
sudo snap install postman
sudo apt install postgresql postgresql-contrib
```

3. #### Setup database project

In the root application directory (api-project-data-jwt), SQL script file (project_setup.sql) is present for creating database. Note: if you already have other user you can use that insted of postgres user referenced bellow

##### Run the script using psql client: 

```
cd Documents/api-project-data-jwt
psql -U postgres --file project_setup.sql
# promt to enter postgres user password (usuall password is postgres)
```

4. #### (Optional) Update database configurations in application.properties

If you have changed defualt user for creating database with some different username and password, update the src/main/resources/application.properties file accordingly:

```
spring.jpa.hibernate.ddl-auto=create #for first time running MUST be set to create, for every consecutive time set to update
spring.datasource.url=jdbc:postgresql://localhost:5432/project_db
spring.datasource.username=postgres
spring.datasource.password=postgres

```

5. #### Run the spring boot application

If you download/clone repo elsewhere, change path update accordingly

```
cd Documents/api-project-data-jwt
mvn clean install
java -jar target/api-project-data-0.0.1-SNAPSHOT.jar
```

this runs at port 8080 and hence all enpoints can be accessed starting from http://localhost:8080

6. #### Create database objects

In the root application directory (api-project-data-jwt), SQL script file (project_db.sql) is present for populating database with some records

##### Run the script using psql client: 

```
cd Documents/api-project-data-jwt
psql -U postgres --file project_db.sql
```

## How to use

1. #### Authentication falied

When trying to use application without providing right credentials we are access denied 

![image](https://user-images.githubusercontent.com/52451893/97893829-11416200-1d32-11eb-87d4-e3dcbca12951.png)

2. #### Get JWT token

In order to get JWT token for further authentication on http://localhost:8080/authenticate POST username:postgers password:postgres 

![image](https://user-images.githubusercontent.com/52451893/97894613-01764d80-1d33-11eb-979a-b7444896b520.png)

3. #### Provide JWT token

In Headers tab set KEY to Authorization and VALUE Bearer {jwt}

![image](https://user-images.githubusercontent.com/52451893/97894218-8d3baa00-1d32-11eb-9866-e7ee6956173a.png)

4. #### GET shops

Example of fetching shops data

![image](https://user-images.githubusercontent.com/52451893/97894794-38e4fa00-1d33-11eb-9020-45788c2971fe.png)


5. #### GET customers

Example of fetching customers data. Items are mapped to specific shop 

![image](https://user-images.githubusercontent.com/52451893/97971354-2a462380-1dc3-11eb-9ced-b60132bfef73.png)

6. #### GET items

Example of fetching items data. Items are mapped to specific shop's customers 

![image](https://user-images.githubusercontent.com/52451893/97894839-47cbac80-1d33-11eb-9351-f5b1f1806990.png)

7. #### POST items

In order to insert new items in JSON object provide one of available user (or insert new customer and then repeat)

![image](https://user-images.githubusercontent.com/52451893/97894896-5d40d680-1d33-11eb-94ad-6c3d61e1f3a1.png)

8. #### PUT items

If you like to change some values, you can do that too (for shops, customers, items)

![image](https://user-images.githubusercontent.com/52451893/97894958-70ec3d00-1d33-11eb-9545-ca83d36dac3b.png)

9. #### DELETE customers

Removing data is also acceptable

![image](https://user-images.githubusercontent.com/52451893/97895018-82cde000-1d33-11eb-99c5-a2cf86f7bb3c.png)

## Code Examples of usage:
With recived data use SQL querys to calculate distances bettween shops and customers

```
SELECT ST_Distance(
ST_GeomFromText((SELECT geom FROM shop WHERE id = 'Instar'), 3765),
ST_GeomFromText((SELECT geom FROM customer WHERE id = 'Valentino Grljušić'), 3765)
);
```

## Features
List of features ready 
* Read data
* Create data
* Update data
* Delete data

## Contact
Created by [@vgrljusic](https://www.linkedin.com/in/vgrljusic/) - feel free to contact me!
