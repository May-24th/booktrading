-- MySQL dump 10.13  Distrib 5.5.19, for Win64 (x86)
--
-- Host: 127.0.0.1    Database: booktrading
-- ------------------------------------------------------
-- Server version	5.5.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bt_book`
--

DROP TABLE IF EXISTS `bt_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bt_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `ISBN` varchar(50) DEFAULT NULL,
  `publisher` varchar(50) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_category` (`cid`),
  KEY `fk_user` (`uid`),
  CONSTRAINT `fk_category` FOREIGN KEY (`cid`) REFERENCES `bt_category` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `fk_user` FOREIGN KEY (`uid`) REFERENCES `bt_user` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bt_book`
--

LOCK TABLES `bt_book` WRITE;
/*!40000 ALTER TABLE `bt_book` DISABLE KEYS */;
INSERT INTO `bt_book` VALUES (1,'活着',20,'9787506365437','作家出版社',1,2),(3,'解忧杂货店',39.5,'9787544270878','南海出版公司',2,2);
/*!40000 ALTER TABLE `bt_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bt_bookimage`
--

DROP TABLE IF EXISTS `bt_bookimage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bt_bookimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) DEFAULT NULL,
  `bid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bt_bookimage_bt_book_id_fk` (`bid`),
  CONSTRAINT `bt_bookimage_bt_book_id_fk` FOREIGN KEY (`bid`) REFERENCES `bt_book` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='图书图像';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bt_bookimage`
--

LOCK TABLES `bt_bookimage` WRITE;
/*!40000 ALTER TABLE `bt_bookimage` DISABLE KEYS */;
INSERT INTO `bt_bookimage` VALUES (6,NULL,1);
/*!40000 ALTER TABLE `bt_bookimage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bt_category`
--

DROP TABLE IF EXISTS `bt_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bt_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='图书的分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bt_category`
--

LOCK TABLES `bt_category` WRITE;
/*!40000 ALTER TABLE `bt_category` DISABLE KEYS */;
INSERT INTO `bt_category` VALUES (1,'文学'),(2,'文化');
/*!40000 ALTER TABLE `bt_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bt_user`
--

DROP TABLE IF EXISTS `bt_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bt_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bt_user`
--

LOCK TABLES `bt_user` WRITE;
/*!40000 ALTER TABLE `bt_user` DISABLE KEYS */;
INSERT INTO `bt_user` VALUES (2,'1001','1001','18209315709','太原'),(3,'1002','1002','18209315709','太原');
/*!40000 ALTER TABLE `bt_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-27 23:33:35
