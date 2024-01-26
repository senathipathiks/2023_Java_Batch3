-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: bank_management
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
-- Table structure for table `account_tbl`
--

DROP TABLE IF EXISTS `account_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account_tbl` (
  `holder_name` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `account_number` varchar(10) NOT NULL,
  `IFSC_code` varchar(20) NOT NULL,
  `bank_id` varchar(20) NOT NULL,
  PRIMARY KEY (`account_number`),
  KEY `bank_id` (`bank_id`),
  CONSTRAINT `account_tbl_ibfk_1` FOREIGN KEY (`bank_id`) REFERENCES `bank_tbl` (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_tbl`
--

LOCK TABLES `account_tbl` WRITE;
/*!40000 ALTER TABLE `account_tbl` DISABLE KEYS */;
INSERT INTO `account_tbl` VALUES ('Sneakha','Saving account','84736534','SBI98463','113'),('Vinisha','Saving account','948747443','IOB676744','114'),('Vinolisha','Saving account','94876743','IOB98744','111');
/*!40000 ALTER TABLE `account_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank_tbl`
--

DROP TABLE IF EXISTS `bank_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank_tbl` (
  `bank_id` varchar(10) NOT NULL,
  `bank_name` varchar(20) NOT NULL,
  `branch_name` varchar(20) NOT NULL,
  `customerid` int NOT NULL,
  PRIMARY KEY (`bank_id`),
  KEY `customerid` (`customerid`),
  CONSTRAINT `bank_tbl_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `registraction_tbl` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_tbl`
--

LOCK TABLES `bank_tbl` WRITE;
/*!40000 ALTER TABLE `bank_tbl` DISABLE KEYS */;
INSERT INTO `bank_tbl` VALUES ('111','IOB','Villukuri',222),('113','SBI','Swamiyarmada,',223),('114','CNA','Attoor',224);
/*!40000 ALTER TABLE `bank_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch_tbl`
--

DROP TABLE IF EXISTS `branch_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch_tbl` (
  `branch_name` varchar(20) NOT NULL,
  `branch_code` varchar(10) NOT NULL,
  `branch_address` varchar(20) NOT NULL,
  `bank_id` varchar(10) NOT NULL,
  `branch_id` varchar(10) NOT NULL,
  PRIMARY KEY (`branch_id`),
  KEY `bank_id` (`bank_id`),
  CONSTRAINT `branch_tbl_ibfk_1` FOREIGN KEY (`bank_id`) REFERENCES `bank_tbl` (`bank_id`),
  CONSTRAINT `branch_tbl_ibfk_2` FOREIGN KEY (`bank_id`) REFERENCES `bank_tbl` (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_tbl`
--

LOCK TABLES `branch_tbl` WRITE;
/*!40000 ALTER TABLE `branch_tbl` DISABLE KEYS */;
INSERT INTO `branch_tbl` VALUES ('Villukuri','IOB','Nagercoil','111','1010'),('Swamiyarmadam','SBI','Vellachicilai','113','1011'),('Attoor','CNA','Vellor','114','1012');
/*!40000 ALTER TABLE `branch_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_tbl`
--

DROP TABLE IF EXISTS `customer_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_tbl` (
  `customerid` int NOT NULL,
  `customer_name` varchar(20) NOT NULL,
  `customer_number` varchar(10) NOT NULL,
  `customer_address` varchar(20) NOT NULL,
  `customeremail` varchar(20) NOT NULL,
  `account_number` varchar(10) NOT NULL,
  PRIMARY KEY (`customerid`),
  KEY `account_number` (`account_number`),
  CONSTRAINT `customer_tbl_ibfk_1` FOREIGN KEY (`account_number`) REFERENCES `account_tbl` (`account_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_tbl`
--

LOCK TABLES `customer_tbl` WRITE;
/*!40000 ALTER TABLE `customer_tbl` DISABLE KEYS */;
INSERT INTO `customer_tbl` VALUES (1,'vinolisha','98763564','chennai','vinolisha8@gmail.com','94876743'),(2,'sneakha','987647434','coimbatore','vinisha@gmail.com','84736534'),(3,'vinisha','99237434','Attoor','sneakha@gmail.com','948747443');
/*!40000 ALTER TABLE `customer_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registraction_tbl`
--

DROP TABLE IF EXISTS `registraction_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registraction_tbl` (
  `registractionId` int NOT NULL,
  `customerid` int NOT NULL,
  `name` varchar(20) NOT NULL,
  `number` varchar(10) NOT NULL,
  `address` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registraction_tbl`
--

LOCK TABLES `registraction_tbl` WRITE;
/*!40000 ALTER TABLE `registraction_tbl` DISABLE KEYS */;
INSERT INTO `registraction_tbl` VALUES (1,222,'vinolisha','98763564','chennai','female','vinolisha8@gmail.com'),(2,223,'vinisha','99237434','attoor','female','vinisha@gmail.com'),(3,224,'sneakha','987647434','coimbatore','female','sneakha@gmail.com');
/*!40000 ALTER TABLE `registraction_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-19 19:40:09
