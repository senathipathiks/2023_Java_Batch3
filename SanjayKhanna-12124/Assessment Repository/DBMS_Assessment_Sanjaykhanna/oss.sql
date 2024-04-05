-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: localhost    Database: oss_db
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
-- Table structure for table `cart_tbl`
--

DROP TABLE IF EXISTS `cart_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_tbl` (
  `cart_id` int NOT NULL,
  `product_id` int DEFAULT NULL,
  PRIMARY KEY (`cart_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `cart_tbl_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product_tbl` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_tbl`
--

LOCK TABLES `cart_tbl` WRITE;
/*!40000 ALTER TABLE `cart_tbl` DISABLE KEYS */;
INSERT INTO `cart_tbl` VALUES (1,1),(2,2),(3,3);
/*!40000 ALTER TABLE `cart_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_tbl`
--

DROP TABLE IF EXISTS `customer_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_tbl` (
  `cus_id` int NOT NULL,
  `cus_name` varchar(20) NOT NULL,
  `cus_age` int DEFAULT NULL,
  `cus_gender` varchar(6) DEFAULT NULL,
  `cus_email` varchar(50) NOT NULL,
  `cus_number` varchar(13) NOT NULL,
  `cart_id` int DEFAULT NULL,
  PRIMARY KEY (`cus_id`),
  KEY `cart_id` (`cart_id`),
  CONSTRAINT `customer_tbl_ibfk_1` FOREIGN KEY (`cart_id`) REFERENCES `cart_tbl` (`cart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_tbl`
--

LOCK TABLES `customer_tbl` WRITE;
/*!40000 ALTER TABLE `customer_tbl` DISABLE KEYS */;
INSERT INTO `customer_tbl` VALUES (1,'Sanjay',23,'Male','sanjay@gmail.com','+916383587926',1),(2,'Sam',22,'Female','sam@gmail.com','+911234567890',2),(3,'khanna',21,'Male','Khanna@gmail.com','1234567890',3);
/*!40000 ALTER TABLE `customer_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_tbl`
--

DROP TABLE IF EXISTS `product_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_tbl` (
  `product_id` int NOT NULL,
  `product_name` varchar(30) NOT NULL,
  `product_type` varchar(15) NOT NULL,
  `product_price` int DEFAULT '0',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_tbl`
--

LOCK TABLES `product_tbl` WRITE;
/*!40000 ALTER TABLE `product_tbl` DISABLE KEYS */;
INSERT INTO `product_tbl` VALUES (1,'Vivo V17','Smart Phone',25000),(2,'Boat TWS','Head phones',20000),(3,'Dell i7','Laptop',54000);
/*!40000 ALTER TABLE `product_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_tbl`
--

DROP TABLE IF EXISTS `purchase_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_tbl` (
  `pur_id` int NOT NULL,
  `pur_date` date NOT NULL,
  `cart_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `trans_id` int DEFAULT NULL,
  PRIMARY KEY (`pur_id`),
  KEY `cart_id` (`cart_id`),
  KEY `product_id` (`product_id`),
  KEY `customer_id` (`customer_id`),
  KEY `trans_id` (`trans_id`),
  CONSTRAINT `purchase_tbl_ibfk_1` FOREIGN KEY (`cart_id`) REFERENCES `cart_tbl` (`cart_id`),
  CONSTRAINT `purchase_tbl_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product_tbl` (`product_id`),
  CONSTRAINT `purchase_tbl_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `customer_tbl` (`cus_id`),
  CONSTRAINT `purchase_tbl_ibfk_4` FOREIGN KEY (`trans_id`) REFERENCES `transaction_tbl` (`trans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_tbl`
--

LOCK TABLES `purchase_tbl` WRITE;
/*!40000 ALTER TABLE `purchase_tbl` DISABLE KEYS */;
INSERT INTO `purchase_tbl` VALUES (2,'2024-01-15',2,2,2,2),(3,'2024-01-18',3,3,3,3);
/*!40000 ALTER TABLE `purchase_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_tbl`
--

DROP TABLE IF EXISTS `transaction_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction_tbl` (
  `trans_id` int NOT NULL,
  `trans_status` varchar(15) NOT NULL,
  `trans_amount` int DEFAULT '0',
  `product_id` int DEFAULT NULL,
  PRIMARY KEY (`trans_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `transaction_tbl_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product_tbl` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_tbl`
--

LOCK TABLES `transaction_tbl` WRITE;
/*!40000 ALTER TABLE `transaction_tbl` DISABLE KEYS */;
INSERT INTO `transaction_tbl` VALUES (1,'Completed',25000,1),(2,'Completed',20000,2),(3,'Completed',54000,3);
/*!40000 ALTER TABLE `transaction_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-19 16:33:07
