-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: localhost    Database: org_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `tbl_bonus`
--

DROP TABLE IF EXISTS `tbl_bonus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_bonus` (
  `worker_ref_id` int DEFAULT NULL,
  `bonus_amount` int DEFAULT NULL,
  `bonus_date` date DEFAULT NULL,
  KEY `worker_ref_id` (`worker_ref_id`),
  CONSTRAINT `tbl_bonus_ibfk_1` FOREIGN KEY (`worker_ref_id`) REFERENCES `tbl_worker` (`worker_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_bonus`
--

LOCK TABLES `tbl_bonus` WRITE;
/*!40000 ALTER TABLE `tbl_bonus` DISABLE KEYS */;
INSERT INTO `tbl_bonus` VALUES (1,5000,'2023-11-30'),(2,3000,'2023-11-30'),(3,4000,'2023-11-30'),(1,4500,'2023-11-30'),(2,3500,'2023-11-30');
/*!40000 ALTER TABLE `tbl_bonus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_title`
--

DROP TABLE IF EXISTS `tbl_title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_title` (
  `worker_ref_id` int DEFAULT NULL,
  `worker_title` varchar(25) DEFAULT NULL,
  `affected_from` date DEFAULT NULL,
  KEY `worker_ref_id` (`worker_ref_id`),
  CONSTRAINT `tbl_title_ibfk_1` FOREIGN KEY (`worker_ref_id`) REFERENCES `tbl_worker` (`worker_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_title`
--

LOCK TABLES `tbl_title` WRITE;
/*!40000 ALTER TABLE `tbl_title` DISABLE KEYS */;
INSERT INTO `tbl_title` VALUES (1,'Manager','2023-10-20'),(2,'Executive','2023-10-25'),(8,'Executive','2023-10-31'),(3,'Manager','2023-11-01'),(4,'Asst. Manager','2023-11-06'),(7,'Executive','2023-11-15'),(6,'Lead','2023-11-20'),(5,'Manager','2023-11-25');
/*!40000 ALTER TABLE `tbl_title` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_worker`
--

DROP TABLE IF EXISTS `tbl_worker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_worker` (
  `worker_id` int NOT NULL AUTO_INCREMENT,
  `worker_name` varchar(30) DEFAULT NULL,
  `salary` int DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`worker_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_worker`
--

LOCK TABLES `tbl_worker` WRITE;
/*!40000 ALTER TABLE `tbl_worker` DISABLE KEYS */;
INSERT INTO `tbl_worker` VALUES (1,'Sanjay Khanna',15000,'2023-10-18','Java Fullstack'),(2,'Kirubhakaran',15000,'2023-10-18','Java Fullstack'),(3,'Jeeva',14999,'2023-10-18','UI,UX'),(4,'Prasanth',13840,'2023-10-18','UI,UX'),(5,'Surya',14840,'2023-10-18','Cloud'),(6,'Vignesh',15140,'2023-10-18','Cloud'),(7,'Vishnu',14990,'2023-10-18','DevOps'),(8,'Prabhu',13840,'2023-10-18','Operations');
/*!40000 ALTER TABLE `tbl_worker` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18 11:55:49
