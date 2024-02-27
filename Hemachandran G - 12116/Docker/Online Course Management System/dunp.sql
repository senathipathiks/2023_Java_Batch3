-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: oms_db
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `adminid` int NOT NULL,
  `adminname` varchar(30) NOT NULL,
  `phnno` varchar(10) NOT NULL,
  `hrid` int NOT NULL,
  PRIMARY KEY (`adminid`),
  KEY `hrid` (`hrid`),
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`hrid`) REFERENCES `hr` (`hrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (212001,'Prakash','8768769876',712001),(212002,'Rajesh','8712343219',712002),(212003,'Suresh','9087896472',712003),(212004,'Somesh','7896543289',712004);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hr`
--

DROP TABLE IF EXISTS `hr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hr` (
  `hrid` int NOT NULL,
  `hrname` varchar(30) NOT NULL,
  `phnno` varchar(10) NOT NULL,
  `adminid` int NOT NULL,
  PRIMARY KEY (`hrid`),
  KEY `adminid` (`adminid`),
  CONSTRAINT `hr_ibfk_1` FOREIGN KEY (`adminid`) REFERENCES `admin` (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hr`
--

LOCK TABLES `hr` WRITE;
/*!40000 ALTER TABLE `hr` DISABLE KEYS */;
INSERT INTO `hr` VALUES (712001,'Rajesh','8796785432',212001),(712002,'Ramesh','8939091234',212002),(712003,'Xavier','7658987659',212003),(712004,'Vijay','9812321456',212004);
/*!40000 ALTER TABLE `hr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itoperation`
--

DROP TABLE IF EXISTS `itoperation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itoperation` (
  `itoperationid` int NOT NULL,
  `itname` varchar(30) NOT NULL,
  `phnno` varchar(10) NOT NULL,
  `hrid` int NOT NULL,
  PRIMARY KEY (`itoperationid`),
  KEY `hrid` (`hrid`),
  CONSTRAINT `itoperation_ibfk_1` FOREIGN KEY (`hrid`) REFERENCES `hr` (`hrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itoperation`
--

LOCK TABLES `itoperation` WRITE;
/*!40000 ALTER TABLE `itoperation` DISABLE KEYS */;
INSERT INTO `itoperation` VALUES (312001,'Mani','7896785432',712001),(312002,'Sekar','9564321789',712002),(312003,'Don','7856439832',712003),(312004,'Kevin','9976890987',712004);
/*!40000 ALTER TABLE `itoperation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `uid` int NOT NULL,
  `uname` varchar(30) NOT NULL,
  `phnNo` varchar(10) NOT NULL,
  `emailId` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `adminid` int NOT NULL,
  `hrid` int NOT NULL,
  `itoperationid` int NOT NULL,
  PRIMARY KEY (`uid`),
  KEY `adminid` (`adminid`),
  KEY `hrid` (`hrid`),
  KEY `itoperationid` (`itoperationid`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`adminid`) REFERENCES `admin` (`adminid`),
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`hrid`) REFERENCES `hr` (`hrid`),
  CONSTRAINT `user_ibfk_3` FOREIGN KEY (`itoperationid`) REFERENCES `itoperation` (`itoperationid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (12111,'Akilan','8954321789','akil111@gmail.com','No.21, nehru st, Chennai-62',212001,712001,312001),(12112,'Bala','9784327823','bala321@gmail.com','No.32,gandhinagar,Chennai-52',212002,712002,312002),(12113,'Charles','7895438792','chan8@gmail.com','No.08,Avadi,Chennai-62',212003,712003,312003);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-21 13:49:12
