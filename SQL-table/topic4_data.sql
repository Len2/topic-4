CREATE DATABASE  IF NOT EXISTS `topic4` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `topic4`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: topic4
-- ------------------------------------------------------
-- Server version	5.5.62

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
-- Table structure for table `data`
--

DROP TABLE IF EXISTS `data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `faelligk_zelle_id` varchar(45) DEFAULT NULL,
  `opstichtag_id` varchar(45) DEFAULT NULL,
  `orgunit_nr` int(11) DEFAULT NULL,
  `position_x` int(11) DEFAULT NULL,
  `position_y` int(11) DEFAULT NULL,
  `background` varchar(45) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  `font` varchar(45) DEFAULT NULL,
  `foreground` varchar(45) DEFAULT NULL,
  `format` varchar(45) DEFAULT NULL,
  `formel` varchar(45) DEFAULT NULL,
  `heigh` varchar(45) DEFAULT NULL,
  `h_alignment` int(11) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  `v_alignment` int(11) DEFAULT NULL,
  `c_width` int(11) DEFAULT NULL,
  `object_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1 COMMENT='data convert to PDF table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data`
--

LOCK TABLES `data` WRITE;
/*!40000 ALTER TABLE `data` DISABLE KEYS */;
INSERT INTO `data` VALUES (1,'wBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,0,0,'#c8c8ff',0,'','','','','',0,'string','.',0,-1,''),(2,'yBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,0,1,'#c8c8ff',0,'','','','','',0,'string','.',0,-1,''),(3,'4CQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,0,2,'#c8c8ff',0,'','','','','',2,'string','200300',0,-1,''),(4,'0CQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,0,3,'#ffff64',0,'','','','','',2,'string','Summe',0,-1,''),(5,'WBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,1,0,'#c8c8ff',0,'','','','','',0,'string','vor -11',0,-1,''),(6,'YBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,1,1,'#c8c8ff',0,'','','','','',0,'string','01.01.1901 - 14.08.2016',0,-1,''),(7,'BCQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,1,2,'#ffffff',0,'','','#,##0.00','','',4,'decimal','44822.490',0,-1,''),(8,'aBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,1,3,'#ffff64',0,'','','#,##0.00','','',4,'decimal','44822.490000',0,-1,''),(9,'cBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,2,0,'#c8c8ff',0,'','','','','',0,'string','-10',0,-1,''),(10,'eBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,2,1,'#c8c8ff',0,'','','','','',0,'string','15.08.2016 - 24.08.2016',0,-1,''),(11,'9CQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,2,2,'#ffffff',0,'','','#,##0.00','','',4,'decimal','50000.000',0,-1,''),(12,'gBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,2,3,'#ffff64',0,'','','#,##0.00','','',4,'decimal','50000.000000',0,-1,''),(13,'iBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,3,0,'#c8c8ff',0,'','','','','',0,'string','0',0,-1,''),(14,'kBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,3,1,'#c8c8ff',0,'','','','','',0,'string','25.08.2016 - 25.08.2016',0,-1,''),(15,'mBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,3,3,'#ffff64',0,'','','#,##0.00','','',4,'decimal','0.000000',0,-1,''),(16,'oBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,4,0,'#c8c8ff',0,'','','','','',0,'string','nach  1',0,-1,''),(17,'qBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,4,1,'#c8c8ff',0,'','','','','',0,'string','26.08.2016 - 31.12.2099',0,-1,''),(18,'ACQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,4,2,'#ffffff',0,'','','#,##0.00','','',4,'decimal','166.700',0,-1,''),(19,'sBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,4,3,'#ffff64',0,'','','#,##0.00','','',4,'decimal','166.700000',0,-1,''),(20,'2CQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,5,0,'#ffff64',0,'','','','','',0,'string','Summe',0,-1,''),(21,'~BQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,5,1,'#ffff64',0,'','','','','',0,'string','.',0,-1,''),(22,'5CQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,5,2,'#ffff64',0,'','','#,##0.00','','',4,'decimal','94989.190',0,-1,''),(23,'uBQSd11VJock0975mqk','Qqkn_01NlhJe08M02SI',100,5,3,'#ffff64',0,'','','#,##0.00','','',4,'decimal','94989.19',0,-1,'');
/*!40000 ALTER TABLE `data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-19 10:48:16
