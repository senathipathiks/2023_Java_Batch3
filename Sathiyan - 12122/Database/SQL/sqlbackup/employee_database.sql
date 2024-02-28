-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_database
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept` (
  `deptid` varchar(45) NOT NULL,
  `dname` varchar(45) NOT NULL,
  `Location` varchar(45) NOT NULL,
  `manager` varchar(45) NOT NULL,
  PRIMARY KEY (`deptid`),
  UNIQUE KEY `deptid_UNIQUE` (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` VALUES ('10','Full Stack Developer','Chennai','Gowtham'),('20','Cloud security','Virudhunagar','Palani'),('30','Senior software developer','Bangalore','Nirmala'),('40','Data Analyst','Chennai','Roopa'),('50','Business Executive','UK','Naveen');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `empid` int unsigned NOT NULL AUTO_INCREMENT,
  `ename` varchar(45) NOT NULL,
  `dept` varchar(45) NOT NULL,
  `deptid` varchar(45) NOT NULL,
  `salary` varchar(45) NOT NULL,
  `mgr` varchar(45) DEFAULT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`empid`),
  UNIQUE KEY `phone_UNIQUE` (`phone`),
  UNIQUE KEY `empid_UNIQUE` (`empid`),
  KEY `deptid` (`deptid`),
  CONSTRAINT `emp_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `dept` (`deptid`)
) ENGINE=InnoDB AUTO_INCREMENT=10025 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (10000,'Sathyan','Full stack development','10','500000','Gowtham','6383286622'),(10001,'Deepika','Full stack development','10','500000','Gowtham','7358679785'),(10002,'Sowmiya','Senior softaware developer','30','450000','Nirmala','7871813320'),(10003,'Varshinee','Data analyst','40','250000','Roopa','9003402909'),(10004,'Karpagam','Business Executive','50','350000','Naveen','9361533247'),(10005,'Vinolisha','Full stack development','20','500000','Gowtham','9150620420'),(10006,'Sherin','Full stack development','40','500000','Gowtham','8056602328'),(10007,'Sundhar','Full stack development','10','500000','Gowtham','7871356090'),(10008,'Srinivasan','Data Analyst','40','250000','Roopa','9489274502'),(10009,'Abishek','Data Analyst','40','250000','Roopa','9787531956'),(10010,'Sanjai Khanna','Data Analyst','40','250000','Roopa','6383587926'),(10011,'Vishnu','Data Analyst','40','250000','Roopa','7558162325'),(10012,'Jeeva','Senior softaware developer','30','450000','Nirmala','9025850014'),(10013,'Durgesh','Senior softaware developer','30','450000','Nirmala','6383102514'),(10014,'Ranjitha','Senior softaware developer','30','450000','Nirmala','6385355643'),(10015,'Bala','Senior softaware developer','30','450000','Nirmala','9398342975'),(10016,'Dharshan','Cloud Security','20','300000','Palani','9789210242'),(10017,'Prasanth','Cloud Security','20','300000','Palani','9025916557'),(10018,'Surya','Cloud Security','20','300000','Palani','8072303463'),(10019,'Prem','Cloud Security','20','300000','Palani','7639498405'),(10020,'Hema','Cloud Security','20','300000','Palani','7449027175'),(10021,'Lokesh','Business Executive','50','350000','Naveen','8778227734'),(10022,'Kiruba','Business Executive','50','350000','Naveen','6382108385'),(10023,'Jothi','Business Executive','50','350000','Naveen','9444397577'),(10024,'Vignesh','Business Executive','50','350000','Naveen','6381645216');
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18 12:21:44
