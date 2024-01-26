-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: crms_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
  `Adminid` int NOT NULL,
  `Adminname` varchar(45) NOT NULL,
  `adminaddress` varchar(45) NOT NULL,
  `adminphn` varchar(45) NOT NULL,
  `userid` int NOT NULL,
  PRIMARY KEY (`Adminid`),
  KEY `userid_idx` (`userid`),
  CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1101,'Surya','Vaanagaram','7410852096',1001),(1102,'Vino','Siruseri','8520741096',1002),(1103,'Sathyan','Maduravoyal','9630741258',1003),(1104,'Jothi','Poonamallee','8574961230',1004),(1105,'Varshinee','Thiruvanmiyur','9685741232',1005);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `paymentid` int NOT NULL,
  `rent_ref_id` int NOT NULL,
  `veh_id` int NOT NULL,
  PRIMARY KEY (`paymentid`),
  KEY `rent_ref_id_idx` (`rent_ref_id`),
  KEY `veh_id_idx` (`veh_id`),
  CONSTRAINT `rent_ref_id` FOREIGN KEY (`rent_ref_id`) REFERENCES `rental` (`rentid`),
  CONSTRAINT `veh_id` FOREIGN KEY (`veh_id`) REFERENCES `vehicle` (`vehid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (501,2001,3001),(502,2002,3002),(503,2003,3003),(504,2004,3004),(505,2005,3005);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental`
--

DROP TABLE IF EXISTS `rental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rental` (
  `rentid` int NOT NULL,
  `veh_ref_id` int NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  `totalcost` int NOT NULL,
  `userid` int NOT NULL,
  PRIMARY KEY (`rentid`),
  KEY `user_id_idx` (`userid`),
  KEY `veh_id_idx` (`veh_ref_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `veh_ref_id` FOREIGN KEY (`veh_ref_id`) REFERENCES `vehicle` (`vehid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental`
--

LOCK TABLES `rental` WRITE;
/*!40000 ALTER TABLE `rental` DISABLE KEYS */;
INSERT INTO `rental` VALUES (2001,3001,'2023-10-11','2023-10-12',5700,1001),(2002,3002,'2023-10-13','2023-10-14',5500,1002),(2003,3003,'2023-10-18','2023-10-19',4680,1003),(2004,3004,'2023-10-20','2023-10-21',1500,1004),(2005,3005,'2023-10-22','2023-10-25',4000,1005);
/*!40000 ALTER TABLE `rental` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userid` int NOT NULL,
  `uname` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `phn_no` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1001,'Srini','Annna nagar','9489274502','srini@gmail.com'),(1002,'Kaviya','Sozhinganallur','9812784503','kaviya@gmail.com'),(1003,'Sundar','Avadi','7496128530','sundar@gmailcom'),(1004,'Prashanth','Vandalur','8796451320','prashanth@gmail.com'),(1005,'Ranjitha','Anna nagar','8574961320','ranjitha@gmail.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `vehid` int NOT NULL,
  `model` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `capacity` varchar(45) NOT NULL,
  `costperkm` int NOT NULL,
  `rentid` int DEFAULT NULL,
  PRIMARY KEY (`vehid`),
  KEY `rentid_idx` (`rentid`),
  CONSTRAINT `rentid` FOREIGN KEY (`rentid`) REFERENCES `rental` (`rentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (3001,'Innova Crystaa','xuv','8',25,2001),(3002,'Safari','xuv','7',24,2002),(3003,'Seltos','mid xuv','5',20,2003),(3004,'Virtus','mid sedon','5',20,2004),(3005,'I20','micro','5',15,2005);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-19 16:35:38
