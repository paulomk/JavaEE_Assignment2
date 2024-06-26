DROP SCHEMA IF EXISTS JAVAEE_ASSIGNMENT;
CREATE SCHEMA JAVAEE_ASSIGNMENT; -- Create database has the same effect

USE JAVAEE_ASSIGNMENT;

DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS(
	`USER_NAME` VARCHAR(20) NOT NULL,
	`PASSWORD` VARCHAR(30) DEFAULT NULL,
	`EMAIL` VARCHAR(250) DEFAULT NULL,
	`CONTACT` VARCHAR(16) DEFAULT NULL,
	`CITY` VARCHAR(45) DEFAULT NULL,
	PRIMARY KEY (USER_NAME)
);

SELECT * FROM USERS;

INSERT INTO USERS(USER_NAME, PASSWORD, EMAIL, CONTACT, CITY)  VALUES
	('superUser', 'mypassword', 'super@email.com', '456-452-1259', 'Toronto'),
	('incredible', 'helloworld', 'mystery@outlook.com', '982-452-1564', 'Vancouver'),
	('sillyguy', 'pizza', 'a12@gmail.com', '996-122-3287', 'New York');
