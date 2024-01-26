CREATE DATABASE WEB;
SHOW DATABASES;
USE WEB;

CREATE TABLE Worker (
	WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	FIRST_NAME CHAR(25),
	LAST_NAME CHAR(25),
	SALARY INT(15),
	JOINING_DATE DATETIME,
	DEPARTMENT CHAR(25)
);

INSERT INTO Worker 
	(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
		(001, 'Monika', 'Arora', 100000, '21-02-20 09.00.00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '21-06-11 09.00.00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '21-02-20 09.00.00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '21-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '21-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '21-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '21-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '21-04-11 09.00.00', 'Admin');

CREATE TABLE Bonus (
	WORKER_REF_ID INT,
	BONUS_AMOUNT INT(10),
	BONUS_DATE DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);

INSERT INTO Bonus 
	(WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
		(001, 5000, '23-02-20'),
		(002, 3000, '23-06-11'),
		(003, 4000, '23-02-20'),
		(001, 4500, '23-02-20'),
		(002, 3500, '23-06-11');

SELECT FIRST_NAME FROM WORKER;
SELECT FIRST_NAME AS WORKER FROM WORKER;

SELECT upper(FIRST_NAME) FROM WORKER;

SELECT * FROM WORKER;

SELECT distinct DEPARTMENT FROM WORKER;

SELECT substr(FIRST_NAME, 1,3) FROM WORKER;

SELECT instr(FIRST_NAME, BINARY 'A') FROM WORKER WHERE FIRST_NAME = "AMITABH";

SELECT rtrim(FIRST_NAME) FROM WORKER;

SELECT rtrim(DEPARTMENT) FROM WORKER;

Select distinct length(DEPARTMENT) from Worker;

Select REPLACE(FIRST_NAME,'a','A') from Worker;

Select CONCAT(FIRST_NAME, ' ', LAST_NAME) AS 'COMPLETE_NAME' from Worker;

Select * from Worker order by FIRST_NAME asc;

Select * from Worker order by FIRST_NAME asc,DEPARTMENT desc;

Select * from Worker where FIRST_NAME in ('Vipul','Satish');

Select * from Worker where FIRST_NAME not in ('Vipul','Satish');

Select * from Worker where DEPARTMENT like 'Admin%';

Select * from Worker where FIRST_NAME like '%a%';

Select * from Worker where FIRST_NAME like '%a';

Select * from Worker where SALARY between 100000 and 500000;

Select * from Worker where year(JOINING_DATE) = 2021 and month(JOINING_DATE) = 2;

