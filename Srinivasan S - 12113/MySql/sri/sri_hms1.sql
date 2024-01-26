-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: sri
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
-- Table structure for table `hms1`
--

DROP TABLE IF EXISTS `hms1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hms1` (
  `Emp_Id` int DEFAULT NULL,
  `Emp_Name` varchar(20) NOT NULL,
  `Position` varchar(20) NOT NULL,
  `Patient_id` varchar(20) NOT NULL,
  `Patient_name` varchar(20) NOT NULL,
  `Age` int DEFAULT NULL,
  `Hosp_Location` varchar(20) DEFAULT 'Neyveli',
  PRIMARY KEY (`Patient_id`),
  UNIQUE KEY `Emp_id` (`Emp_Id`),
  CONSTRAINT `hms1_chk_1` CHECK ((`Age` >= 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms1`
--

LOCK TABLES `hms1` WRITE;
/*!40000 ALTER TABLE `hms1` DISABLE KEYS */;
INSERT INTO `hms1` VALUES (111,'Dr.Srinivasan','CEO & MD','121','kp',22,'Tenkasi'),(112,'Dr.Sundar','Cardiologist','122','Kuppusamy',72,'Cuddalorre'),(113,'Dr.Prashanth','Neurologist','123','Malathi',52,'Villupuram'),(114,'Dr.Govindan','Osthomology','124','Allwin',23,'Neyveli');
/*!40000 ALTER TABLE `hms1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18 12:07:02
