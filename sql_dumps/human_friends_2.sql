-- MySQL dump 10.13  Distrib 8.0.37, for Linux (x86_64)
--
-- Host: localhost    Database: human_friends
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `Animal`
--

DROP TABLE IF EXISTS `Animal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Animal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Animal`
--

LOCK TABLES `Animal` WRITE;
/*!40000 ALTER TABLE `Animal` DISABLE KEYS */;
INSERT INTO `Animal` VALUES (1,'Домашние'),(2,'Вьючные');
/*!40000 ALTER TABLE `Animal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `camels`
--

DROP TABLE IF EXISTS `camels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `camels` (
  `id` int NOT NULL AUTO_INCREMENT,
  `camel_name` varchar(20) NOT NULL,
  `date_birth` date NOT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `id_pack` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `camel_pack` (`id_pack`),
  CONSTRAINT `camel_pack` FOREIGN KEY (`id_pack`) REFERENCES `pack_animals` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `camels`
--

LOCK TABLES `camels` WRITE;
/*!40000 ALTER TABLE `camels` DISABLE KEYS */;
/*!40000 ALTER TABLE `camels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cats`
--

DROP TABLE IF EXISTS `cats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cats` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(20) NOT NULL,
  `date_birth` date NOT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `id_home` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cat_home` (`id_home`),
  CONSTRAINT `cat_home` FOREIGN KEY (`id_home`) REFERENCES `home_animals` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cats`
--

LOCK TABLES `cats` WRITE;
/*!40000 ALTER TABLE `cats` DISABLE KEYS */;
INSERT INTO `cats` VALUES (5,'Мурзик','2022-04-05','голос кувырок',2),(6,'Барсик','2023-09-13','лежать',2),(7,'Тима','2023-04-01','',2),(8,'Кузя','2022-08-01','лежать',2);
/*!40000 ALTER TABLE `cats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dogs`
--

DROP TABLE IF EXISTS `dogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dogs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dog_name` varchar(20) NOT NULL,
  `date_birth` date NOT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `id_home` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dog_home` (`id_home`),
  CONSTRAINT `dog_home` FOREIGN KEY (`id_home`) REFERENCES `home_animals` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dogs`
--

LOCK TABLES `dogs` WRITE;
/*!40000 ALTER TABLE `dogs` DISABLE KEYS */;
INSERT INTO `dogs` VALUES (1,'Рыжик','2022-04-25','сидеть рядом лежать',1),(2,'Бобик','2023-12-23','сидть лежать',1),(3,'Барбос','2022-05-05','сидеть голос',1),(4,'Тузик','2023-01-03','сидеть аппорт',1);
/*!40000 ALTER TABLE `dogs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donkeys`
--

DROP TABLE IF EXISTS `donkeys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donkeys` (
  `id` int NOT NULL AUTO_INCREMENT,
  `donkey_name` varchar(20) NOT NULL,
  `date_birth` date NOT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `id_pack` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `donkey_pack` (`id_pack`),
  CONSTRAINT `donkey_pack` FOREIGN KEY (`id_pack`) REFERENCES `pack_animals` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donkeys`
--

LOCK TABLES `donkeys` WRITE;
/*!40000 ALTER TABLE `donkeys` DISABLE KEYS */;
INSERT INTO `donkeys` VALUES (1,'Мерфи','2021-07-12','',3),(2,'Петрович','2021-06-23','',3),(3,'Сивка','2021-03-23','',3);
/*!40000 ALTER TABLE `donkeys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hamsters`
--

DROP TABLE IF EXISTS `hamsters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hamsters` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hamster_name` varchar(20) NOT NULL,
  `date_birth` date NOT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `id_home` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hamster_home` (`id_home`),
  CONSTRAINT `hamster_home` FOREIGN KEY (`id_home`) REFERENCES `home_animals` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hamsters`
--

LOCK TABLES `hamsters` WRITE;
/*!40000 ALTER TABLE `hamsters` DISABLE KEYS */;
INSERT INTO `hamsters` VALUES (1,'Кусач','2023-12-12','',3),(2,'Мотя','2024-01-15','',3),(3,'Ботя','2023-09-02','',3);
/*!40000 ALTER TABLE `hamsters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `home_animals`
--

DROP TABLE IF EXISTS `home_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `home_animals` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `id_Animal` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `only_home` (`id_Animal`),
  CONSTRAINT `only_home` FOREIGN KEY (`id_Animal`) REFERENCES `Animal` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `home_animals`
--

LOCK TABLES `home_animals` WRITE;
/*!40000 ALTER TABLE `home_animals` DISABLE KEYS */;
INSERT INTO `home_animals` VALUES (1,'Собаки',1),(2,'Кошки',1),(3,'Хомяки',1);
/*!40000 ALTER TABLE `home_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horses`
--

DROP TABLE IF EXISTS `horses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `horse_name` varchar(20) NOT NULL,
  `date_birth` date NOT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `id_pack` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `horse_pack` (`id_pack`),
  CONSTRAINT `horse_pack` FOREIGN KEY (`id_pack`) REFERENCES `pack_animals` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horses`
--

LOCK TABLES `horses` WRITE;
/*!40000 ALTER TABLE `horses` DISABLE KEYS */;
INSERT INTO `horses` VALUES (1,'Звездочка','2022-05-06','стой но',1),(2,'Чернышь','2022-03-13','стой но прр',1),(3,'Барс','2022-10-02','стой но',1);
/*!40000 ALTER TABLE `horses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pack_animals`
--

DROP TABLE IF EXISTS `pack_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pack_animals` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `id_Animal` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `only_pack` (`id_Animal`),
  CONSTRAINT `only_pack` FOREIGN KEY (`id_Animal`) REFERENCES `Animal` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pack_animals`
--

LOCK TABLES `pack_animals` WRITE;
/*!40000 ALTER TABLE `pack_animals` DISABLE KEYS */;
INSERT INTO `pack_animals` VALUES (1,'Лошади',2),(2,'Верблюды',2),(3,'Ослы',2);
/*!40000 ALTER TABLE `pack_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `young_animals`
--

DROP TABLE IF EXISTS `young_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `young_animals` (
  `id` int NOT NULL,
  `animal_name` varchar(20) DEFAULT NULL,
  `date_birth` datetime DEFAULT NULL,
  `commands` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `young_animals`
--

LOCK TABLES `young_animals` WRITE;
/*!40000 ALTER TABLE `young_animals` DISABLE KEYS */;
INSERT INTO `young_animals` VALUES (1,'Рыжик','2022-04-25 00:00:00','сидеть рядом лежать','2лет0мес'),(3,'Барбос','2022-05-05 00:00:00','сидеть голос','1лет11мес'),(4,'Тузик','2023-01-03 00:00:00','сидеть аппорт','1лет4мес'),(5,'Мурзик','2022-04-05 00:00:00','голос кувырок','2лет0мес'),(7,'Тима','2023-04-01 00:00:00','','1лет1мес'),(8,'Кузя','2022-08-01 00:00:00','лежать','1лет9мес'),(1,'Звездочка','2022-05-06 00:00:00','стой но','1лет11мес'),(2,'Чернышь','2022-03-13 00:00:00','стой но прр','2лет1мес'),(3,'Барс','2022-10-02 00:00:00','стой но','1лет7мес'),(1,'Мерфи','2021-07-12 00:00:00','','2лет9мес'),(2,'Петрович','2021-06-23 00:00:00','','2лет10мес');
/*!40000 ALTER TABLE `young_animals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-04 22:23:05
