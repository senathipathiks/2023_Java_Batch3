-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: sms
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
-- Table structure for table `bug_history`
--

DROP TABLE IF EXISTS `bug_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bug_history` (
  `Bugid` varchar(10) NOT NULL,
  `Bug_Name` varchar(50) NOT NULL,
  `Description` varchar(200) NOT NULL,
  `Identified_By` varchar(20) NOT NULL,
  `Resolved_By` varchar(20) NOT NULL,
  PRIMARY KEY (`Bugid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bug_history`
--

LOCK TABLES `bug_history` WRITE;
/*!40000 ALTER TABLE `bug_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `bug_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_details`
--

DROP TABLE IF EXISTS `c_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_details` (
  `CourseID` int NOT NULL,
  `CourseName` varchar(20) NOT NULL,
  `CourseType` varchar(20) NOT NULL,
  `CourseDuration` int NOT NULL,
  `CourseFee` float NOT NULL,
  PRIMARY KEY (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_details`
--

LOCK TABLES `c_details` WRITE;
/*!40000 ALTER TABLE `c_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `c_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stud_detail`
--

DROP TABLE IF EXISTS `stud_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stud_detail` (
  `SId` int NOT NULL,
  `SName` varchar(45) NOT NULL,
  `SCity` varchar(45) NOT NULL,
  PRIMARY KEY (`SId`),
  UNIQUE KEY `SId_UNIQUE` (`SId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stud_detail`
--

LOCK TABLES `stud_detail` WRITE;
/*!40000 ALTER TABLE `stud_detail` DISABLE KEYS */;
INSERT INTO `stud_detail` VALUES (23,'anu','delhi'),(43,'sam','Hyd'),(111,'Vishnu','Tirupur'),(346,'anusuya','Hyd'),(765,'Sathiyan Sivarajan','Chennai'),(12137,'Deepika','Chennai'),(12345,'ser','Madurai');
/*!40000 ALTER TABLE `stud_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-21 13:47:30
