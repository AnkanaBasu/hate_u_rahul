use spring_db;
CREATE TABLE employee(
id int(5) NOT NULL DEFAULT '0',
name varchar(50) DEFAULT NULL,
salary double(7,2) DEFAULT NULL,
department varchar(20) DEFAULT NULL,
Primary Key(id)
);